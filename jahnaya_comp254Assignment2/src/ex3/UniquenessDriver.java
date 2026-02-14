package ex3;
import java.util.Random;
public class UniquenessDriver {

    public static void runExperiment(int n) {
        int[] data = new int [n];
        Random rand = new Random();

        for (int i = 0; i <n; i++) {
            data[i] = rand.nextInt(n * 2);
        }

        long start = System.nanoTime();
        Uniqueness.unique1(data);
        long end = System.nanoTime();
        System.out.println("Unique1: Value n: " + n + " time: " + (end - start));

        start = System.nanoTime();
        Uniqueness.unique2(data);
        end = System.nanoTime();
        System.out.println("Unique2: Value n: " + n + " time:" + (end - start));
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 2000, 4000, 8000, 16000};

        for (int n: sizes) {
            runExperiment(n);
        }
    }
}
