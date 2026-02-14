package ex2;

import static ex2.ExperimentalAnalysis.prefixAverage1;
import static ex2.ExperimentalAnalysis.prefixAverage2;

public class ExperimentalAnalysisDriver {

    public static void runExperiment(int n) {
        double [] data = new double[n];
        for (int i = 0; i <n; i++) {
            data[i] = Math.random();
        }

        long start = System.nanoTime();
        prefixAverage1(data);
        long end = System.nanoTime();
        System.out.println("prefixAverage1: Value of n: " + n + " time: " + (end - start));

        start = System.nanoTime();
        prefixAverage2(data);
        end = System.nanoTime();
        System.out.println("prefixAverage2: Value of n: " + n + " time: " + (end - start));
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 2000, 4000, 8000, 16000};

        for (int n: sizes) {
            runExperiment(n);
        }
    }
}
