package ex2;

public class SinglyLinkedListDriver {

    public static void main (String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addFirst(6);
        list.addFirst(4);
        list.addFirst(2);

        SinglyLinkedList.Node<Integer> n1 = list.head;
        SinglyLinkedList.Node<Integer> n2 = list.head.next.next;

        System.out.println("Before node swap:");
        list.printList();

        list.swapNodes(n1, n2);

        System.out.println("After the node swap:");
        list.printList();
    }
}

