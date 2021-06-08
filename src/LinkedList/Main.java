package LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //Insert 6
        list.append(6);

        //Insert 7 at the beginning
        list.push(7);

        //Insert 1 at the beginning
        list.push(1);

        //Inset 4 at the end
        list.append(4);

        //Insert 8 after 7
        list.insertAfter(list.head.next, 8);

        System.out.println("Created list : ");
        list.printList();
    }
}
