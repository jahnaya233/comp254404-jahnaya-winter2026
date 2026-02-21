package ex2;

public class Palindrome {

    public static boolean isPalidrome(String s) {
        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalidrome(s.substring(1, s.length() - 1));
    }
}
