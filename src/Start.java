public class Start {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.add("op");

        for(int i = 1; i < 10; i++) {
            llist.add(i);
        }

        int count = llist.size();

        llist.printList();
    }
}
