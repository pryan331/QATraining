package CollectionsFramework;
//In Java Linked List class uses a doubly to store the elements.
//it provides linked list data structure
// it inherits the abstractList class and implements list and DeQUE interface.
// in java a linked list class can contain duplicate elements.
//java linkedlist class maintains insertion order.
// it is not synchronized.
//manipulation occurs fast as no shifting needs to occur.
//it can be used as List stack or queue.


//in the below example the 'Node class represents a node in the linked list.
//containing an integer value 'data' and a reference to the next node 'next'
//the linked list class manages the operations on the linked list such as insertion and display
// in main method we are creating and inserting elements to linkedList.
//we can implement methods like delete and search as well.
//consider linkedList as a chain which has a head and there are elements attached to it.


//it is linear and every element is an object, and not stored in a continuous memory.
//every element has a separate data address as it is a separate object.
//every element has a previous and a next.. could be null..

public class AboutLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.display();


    }

}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    public LinkedList(){
        this.head=null;
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display(){
        Node current = head;
        while (current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}




