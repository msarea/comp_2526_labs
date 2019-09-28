package driver;
import collection.*;

public class LinkedListDriver {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(4);
        list.addNode(1);
        list.addNode(4);
        list.addNode(3);
        list.addNode(5);
        System.out.print("Original list: ");
        list.printList();

        // System.out.print("Removed 3: ");
        // list.removeNode(3);
        // list.printList();

        // System.out.print("Re add 3: ");
        // list.addNode(3);
        // list.printList();

        // System.out.print("Removed 3 again: ");
        // list.removeNode(3);
        // list.printList();

        // System.out.print("Removed duplicates: ");
        // list.removeDuplicates();
        // list.printList();

        int num = list.findKthToLast(9);
        System.out.println("3rd to last: " + Integer.toString(num));
        // list.printList();
    }
}