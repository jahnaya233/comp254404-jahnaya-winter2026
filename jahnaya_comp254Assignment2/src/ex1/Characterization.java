package ex1;

public class Characterization {


    //big-Oh: O(n)
    //This is because this loop runs once for all the n elements within the array.
        public static int example1(int[] arr) {
            int n = arr.length, total = 0;
            for (int j=0; j < n; j++)
                total += arr[j];
            return total;
        }

    //big-Oh: O(n)
    //This is because the loop increases by 2, however the loop changes with n.
        public static int example2(int[] arr) {
            int n = arr.length, total = 0;
            for (int j=0; j < n; j += 2)
                total += arr[j];
            return total;
        }

    //big-Oh: O(n^2)
    //First the outside loop runs n amount of times and after the inner loop runs j amount of times.

        public static int example3(int[] arr) {
            int n = arr.length, total = 0;
            for (int j=0; j < n; j++)
                for (int k=0; k <= j; k++)
                    total += arr[j];
            return total;
        }

    //big-Oh: O(n)
    //This loop runs a single time for every element in the array.
        public static int example4(int[] arr) {
            int n = arr.length, prefix = 0, total = 0;
            for (int j=0; j < n; j++) {
                prefix += arr[j];
                total += prefix;
            }
            return total;
        }

    //big-Oh: O(n^3)
    //There are three loops here that are nested, and they all depend on n.
        public static int example5(int[] first, int[] second) { // assume equal-length arrays
            int n = first.length, count = 0;
            for (int i=0; i < n; i++) {
                int total = 0;
                for (int j=0; j < n; j++)
                    for (int k=0; k <= j; k++)
                        total += first[k];
                if (second[i] == total) count++;
            }
            return count;
        }

    }

