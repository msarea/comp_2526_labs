package data;

public class Node {
    private int data;
    private Node next;

    /**
     * Default constructor
     */
    public Node() {

    }

    /**
     * @param data
     *      integer stored in node
     */
    public Node(int d) {
        setData(d);
    }

    public Node getNext() {
        return this.next;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }

    public void setData(int data) {
        this.data = data;
    }

    /**
     * 
     */
    @Override
	public String toString() {
        String stringData = "";
        if (this.next != null) {
            stringData += data + "->";
        } else {
            stringData += data;
        }
		return stringData;
	}

}