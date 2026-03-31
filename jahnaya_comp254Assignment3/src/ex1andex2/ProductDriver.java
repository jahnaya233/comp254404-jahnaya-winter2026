package ex1andex2;

import java.util.Scanner;

public class ProductDriver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//user prompts
        System.out.print(("Enter one integer. (must be positive): "));
        int m = input.nextInt();

        System.out.print(("Enter another integer. (must be positive): "));
        int n = input.nextInt();
//results
        int result = Product.product(m,n);
        System.out.println("Product: " + result);

        input.close();
    }
}
