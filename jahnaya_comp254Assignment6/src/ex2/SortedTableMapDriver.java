package ex2;

public class SortedTableMapDriver {

    public static void main(String[] args) {
        SortedTableMap<Integer, String> map = new SortedTableMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(14));

    }
}
