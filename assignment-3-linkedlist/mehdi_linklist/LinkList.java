public class LinkList {
    Node head;

    public LinkList(){

    }

    public void addNode(int d){
        Node newItem = new Node(d);
        newItem.next = head;
        head = newItem;
    }

    public void printList(){
        Node element = head;
        while(element != null) {
            System.out.println("" + element.data);
            element = element.next;
        }
    }

    public void removeDuplicates() {
        Node element1 = head;
        Node element2 = null;
        Node duplicate = null;

        while (element1 != null && element1.next != null) {
            element2 = element1;

            while (element2.next != null) {
                if (element1.data == element2.next.data) {
                    duplicate = element2.next;
                    element2.next = element2.next.next;
                } else {
                    element2 = element2.next;
                }
            }
            element1 = element1.next;
        }
    }


    public void removeNode(int key){
        Node temp = head;
        Node prev = null;

        if(temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null) {
            System.out.println("There is no " + key + " in the list.");
            return;
        }

        prev.next = temp.next;

    }

    public int lengthList() {
        Node element = head;
        int length = 0;
        while (element != null) {
            element = element.next;
            length++;
        }
        return length;
    }

    public void kthToLast(int k){
        Node element = head;

        if (k > (lengthList()-1)) {
            System.out.println("The lenth of list is " + lengthList() + ". Please select smaller index.");
            return;
        }

        int index = lengthList()-1;
        while(index != k){
            element = element.next;
            index --;
        }
        System.out.println(""+ element.data);
        return;
    }

}
