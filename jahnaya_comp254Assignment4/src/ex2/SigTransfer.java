package ex2;
import java.util.Stack;

public class SigTransfer {
    public static <E> void transfer(Stack<E> S, Stack<E> T) {
        while (!S.isEmpty()) {
            T.push(S.pop());
        }
    }

}
