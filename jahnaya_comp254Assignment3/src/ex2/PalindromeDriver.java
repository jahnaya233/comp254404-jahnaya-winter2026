package ex2;

import java.util.Scanner;

public class PalindromeDriver {

    //Testing
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//User prompts
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        //results

        if(Palindrome.isPalidrome(text)) {
            System.out.println("The string you entered is a palindrome");
        } else {
            System.out.println("The string you entered is not a palindrome");
        }
        input.close();
    }
}
