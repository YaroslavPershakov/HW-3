class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
    }
}


public class LinkedList {
    private Node root;

    public void add(Object item) {
        Node tmpItem = new Node(item);
        Node lastItem = findLast();

        if (lastItem != null) {
            lastItem.next = tmpItem;
        } else {
            root = tmpItem;
        }
    }

    public void printList() {
        Node tmpItem = root;

        while (tmpItem.next != null) {
            System.out.println(tmpItem.data);
            tmpItem = tmpItem.next;
        }
    }

    public int size() {
        int size = 0;

        if (root == null) {
            return 0;
        } else {
            size = 1;
            Node current = root;

            while (current.next != null) {
                size++;
                current = current.next;
            }
        }

        return size;
    }

    private Node findLast() {
        if (root == null)
            return null;
        else {
            Node current = root;

            while (current.next != null) {
                current = current.next;
            }

            return current;
        }
    }
}