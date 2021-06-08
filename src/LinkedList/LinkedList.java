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

    public void insertAfter(Node prev_node, int new_data){
        //check if the given node is null
        if(prev_node == null){
            System.out.println("The given previous node can't be null");
            return;
        }

        //Allocate the node & Put in the data
        Node new_node = new Node(new_data);

        //make next of new_nodeas next of prev_node
        new_node.next = prev_node.next;

        //make next of previous node as new node
        prev_node.next = new_node;
    }

    public void append(int new_data){
        //1. Allocate the new node
        //2. Put in the data
        //3. Set next as null
        Node new_node = new Node(new_data);

        //4. If list is empty, then make the new as head
        if(head == null){
            head = new Node(new_data);
            return;
        }

        //4. This new node is going to be the last node, so make next of it as null
        new_node.next = null;

        //5.Else traverse till the last node
        Node last = head;

        while(last.next != null){
            last = last.next;
        }

        //6. Change the next of the last node
        last.next = new_node;
        return;
    }

    public void printList(){
        Node tnode = head;

        while(tnode.next != null){
            System.out.print(tnode.data + " -> ");
            tnode = tnode.next;
            if(tnode.next == null) {
                System.out.println(tnode.data);
                break;
            }
        }
    }

}
