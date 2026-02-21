package ex3;
import java.io.File;

public class FindPath {

    public static void find(String path, String filename) {
        File file = new File(path);

        if (!file.isDirectory()) {
            return;
        }
            File[] files = file.listFiles();
            if (files == null) return;

            for (File f : files) {
                if (f.getName().equals(filename)) {
                    System.out.println(f.getAbsolutePath());
                }
                if (f.isDirectory()) {
                    find(f.getAbsolutePath(), filename);
                }
            }
        }}


