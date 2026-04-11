package ex1;
import java.util.Random;

public class AbstractHashMapDriver {

    public static void main(String[] args) {
        ChainHashMap<Integer, Integer> map =
                new ChainHashMap<>(11, 0.75);

        Random rand = new Random();

        long start = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++) {
            map.put(rand.nextInt(100000), i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time: " + (end - start) + " ms");
    }
}
