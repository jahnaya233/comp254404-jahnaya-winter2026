package ex2;

public class SinglyLinkedList<E> {

    static class Node<E> {
        E element;
        Node<E> next;

        Node(E e, Node<E> n) {
            element = e;
            next= n;

        }
    }
    public Node<E> head = null;

    public void addFirst(E e) {
        head = new Node<>(e, head);
    }

    public void swapNodes(Node<E> firstNode, Node<E> secondNode) {
        if (firstNode == secondNode) return;
        Node<E> prev1 = null, prev2 = null, current = head;

        while (current != null && (prev1 == null || prev2 == null)) {
            if (current.next == firstNode) prev1 = current;
            if (current.next == secondNode) prev2 = current;
            current = current.next;
        }

        if (firstNode == head) prev1 = null;
        if (secondNode == head) prev2 = null;
        if (prev1 != null) prev1.next = secondNode;
        else head = secondNode;

        if (prev2 != null) prev2.next = firstNode;
        else head = firstNode;

        Node<E> temp = firstNode.next;
        firstNode.next = secondNode.next;
        secondNode.next = temp;
    }
        public void printList() {
            Node<E> current = head;
            while(current != null) {
                System.out.print(current.element + " ");
                current = current.next;
            }
            System.out.println();
        }
    }


