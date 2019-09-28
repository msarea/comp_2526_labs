package collection;

import data.*;
import java.util.HashMap;

public class LinkedList {
    private Node head;
    HashMap<Integer, Node> duplicateData = new HashMap<Integer, Node>();

    /**
     * Default constructor
     */
    public LinkedList() {

    }
    
    /**
     * Add the node to the list
     * @param nextNode
     *      the next following node of the list
     */
    public void addNode(int d) {
        Node newNode = new Node(d);
        if (this.head != null) {
            newNode.setNext(this.head);
        }
        this.head = newNode;
    }

    /**
     * Remove specified node
     */
    public boolean removeNode(int d) {
        Node currNode = this.head;
        while(currNode != null) {
            Node nextNode = currNode.getNext();
            if (currNode.getData() == d) {
                currNode.setNext(null);
                this.head = nextNode;
                return true;
            }
            if (nextNode != null && nextNode.getData() == d) {
                currNode.setNext(nextNode.getNext());
                return true;
            }
           currNode = nextNode;
        }
        return false;
    }

    /**
     * Remove duplicated data in the list
     */
    public void removeDuplicates() {
        Node currNode = this.head;
        while(currNode != null) {
            Node nextNode = currNode.getNext();
            if (duplicateData.containsKey(currNode.getData())) {
                currNode.setNext(null);
                this.head = nextNode;
                continue;
            }
            if (nextNode != null && duplicateData.containsKey(nextNode.getData())) {
                currNode.setNext(nextNode.getNext());
                continue;
            }
            duplicateData.put(currNode.getData(), currNode);
            currNode = nextNode;
        }
    }

    // /** 
    //  * 
    //  */
    // public void sortList() {
    //     Node currNode = this.head;
    //     while(currNode != null) {
    //         Node nextNode = currNode.getNext();
    //         while(nextNode != null) {
    //             if(currNode.getData() > nextNode.getData()) {
    //                 // 5 -> 4 // 4 
    //                 currNode.setNext(nextNode.getNext()); // 5 -> 1
    //                 nextNode.setNext(currNode); // 4 -> 5
    //                 this.head = nextNode; // head = 4
    //                 nextNode = currNode.getNext();
    //                 continue;
    //             }
    //            if(this.head.getData() > nextNode.getData()) {
    //                 this.head.setNext(nextNode);
    //                 this.head = nextNode;
    //             }
    //         }
    //         // System.out.println(currNode.getData());
    //         currNode = nextNode;
    //     }
    // }
    /**
     * get length of linkedList
     * @return int length of list
     */
    public int length() {
        int counter = 0;
        Node currNode = this.head;
        while(currNode != null) {
            counter += 1;
            currNode = currNode.getNext();
        }
        return counter;
    }

    /**
     * @param kthToLastNum
     * @return data of the kthToLast Node of the list
     * @throws IllegalArgumentException if kthToLastNum is longer than the list length
     */
    public int findKthToLast(int kthToLastNum) {
        int lengthOfList = this.length();
        int resultData = 0;
        Node currNode = this.head;

        if (kthToLastNum > lengthOfList) {
            throw new IllegalArgumentException("Number is longer than the length of the list: " + lengthOfList);
        }
        for (int i = 0; i <= lengthOfList - kthToLastNum; i++ ) {
            resultData = currNode.getData();
            currNode = currNode.getNext();
        }
        return resultData;
    }

    /**
     * print the entire list
     */
    public void printList() {
        Node currNode = this.head;
        String totalList = "";
        while(currNode != null) {
            totalList += currNode.toString();
            currNode = currNode.getNext();
        }
        System.out.println(totalList);
    }
}