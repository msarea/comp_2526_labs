public class Node {
    int data;
    Node next;



    public Node(int d){
        data = d;
        next = null;
    }

    public Node getData(int data){
        return next;
    }

    @Override
    public String toString(){
        return ""+ data;
    }

}
