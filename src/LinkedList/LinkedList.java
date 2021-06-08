package LinkedList;

public class LinkedList {

    Node head; // head of the list

    //Node class

    static class Node {
        int data;
        Node next;

        //constructor to create a node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    //This function in LinkedList class inserts a new node at the beginning
    public void push(int new_data){
        /*1 & 2 : Allocate the Node &
                   Put in the data */
        Node new_node = new Node(new_data);

        // 3. Make next of new node as head
        new_node.next = head;

        //4. Move the head to point the new node
        head = new_node;
    }

}