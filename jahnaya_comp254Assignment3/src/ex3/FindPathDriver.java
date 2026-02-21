package ex3;
import java.util.Scanner;

public class FindPathDriver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//user prompts
        System.out.print("Enter the root path name: ");
        String path = input.nextLine();
//causes errors without file type included
        System.out.print("Enter the file name(including file type): ");
        String filename = input.nextLine();

        FindPath.find(path, filename);
        input.close();


    }
}
