package LinkedList;

public class LinkedList {

    Node head; // head of the list

    //Node class

    static class Node {
        int data;
        Node next;

        Node(){
            data = 0;
            next = null;
        }

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

        System.out.println("Linked List created successfully!");
    }

    public void insertAfter(int data, int new_data){
        Node prev_node = ifNodeExist(0);
        if(ifNodeExist(data) == null){
            System.out.println("Node doesn't exist, insert an appropriate number");
            return;
        }else {
            prev_node = ifNodeExist(data);
        }

        //Allocate the node & Put in the data
        Node new_node = new Node(new_data);

        //make next of new_nodeas next of prev_node
        new_node.next = prev_node.next;

        //make next of previous node as new node
        prev_node.next = new_node;
        System.out.println("Node Inserted Successfully!");
    }

    public void append(int new_data){
        //1. Allocate the new node
        //2. Put in the data
        //3. Set next as null
        Node new_node = new Node(new_data);

        //4. If list is empty, then make the new as head
        if(head == null){
            head = new Node(new_data);
            System.out.println("Node appended successfully!");
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
        System.out.println("Node appended successfully!");
        return;
    }

    public void printList(){
        Node tnode = head;

        if(tnode == null){
            System.out.println("Linked List is empty");
            return;
        }

        if(tnode.next == null){
            System.out.println(tnode.data);
        }

        while(tnode.next != null){
            System.out.print(tnode.data + " -> ");
            tnode = tnode.next;
            if(tnode.next == null) {
                System.out.println(tnode.data);
                break;
            }
        }
    }

    public Node ifNodeExist(int new_node){
        Node last = head;
        while(last.next != null){
            if(last.data == new_node){
                return last;
            }
            last = last.next;
        }
        return null;
    }

    public void deleteNode(int key){
        //store the head node
        Node temp = head;
        Node prev = null;

        //if head node itself holds the key
        if(temp!=null && temp.data == key){
            head = temp.next;
            System.out.println("Node deleted successfully!");
            return;
        }

        //search for the key to be deleted, keep track
        //of the previous node as we need to change
        //temp.next

        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }

        //If key was not found
        if(temp == null){
            System.out.println("Enter a valid number that is present in the linked list");
            return;
        }
        //unlink the node from list

        prev.next = temp.next;
        System.out.println("Node deleted successfully!");
    }
}
