package ex1;


public class PositionalListDriver {

    public static void main(String[] args) {

        LinkedPositionalList<Integer> list = new LinkedPositionalList<>();

        Position<Integer> p1 = list.addLast(10);
        Position<Integer> p2 = list.addLast(20);
        Position<Integer> p3 = list.addLast(30);

        System.out.println(PositionalListUtils.indexOf(list, p1));
        System.out.println(PositionalListUtils.indexOf(list, p2));
        System.out.println(PositionalListUtils.indexOf(list, p3));




    }
}
