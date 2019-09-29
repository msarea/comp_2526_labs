public class LinkListTest {
    public static void main(String args[]){
        LinkList myList = new LinkList();
        myList.addNode(1);
        myList.addNode(4);
        myList.addNode(5);
        myList.addNode(4);
        myList.addNode(3);


        System.out.println("Original List");
        myList.printList();

        myList.removeNode(3);
        System.out.println("List with Deleted Node");
        myList.printList();

        myList.addNode(3);
        System.out.println("List with Added Node");
        myList.printList();

        myList.removeDuplicates();
        System.out.println("Remove Duplicated Node");
        myList.printList();

        System.out.print("Kth item of list: ");
        myList.kthToLast(2);

    }
}
