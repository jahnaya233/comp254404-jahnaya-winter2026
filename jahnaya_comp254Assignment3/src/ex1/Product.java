package ex1;

public class Product {

    public static int product(int m, int n) {
        if (n==0) {
            return 0;
        }
        return m + product(m, n - 1);
    }
}
