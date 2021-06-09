package LinkedList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int option = 1;

        while(option != 0){
            System.out.println("Enter your choice : ");
            System.out.println("(1) Press 1 to create a new list : ");
            System.out.println("(2) Press 2 to insert at the beginning of the list : ");
            System.out.println("(3) Press 3 to insert at the end of the node : ");
            System.out.println("(4) Press 4 to insert at a specific position of the node : ");
            System.out.println("(5) Press 5 to print the linked list : ");
            System.out.println("(6) Press 6 to delete a node from the list : ");
            System.out.println(" Press 0 to exit");
            option = scan.nextInt();

            switch (option){
                case(1):{
                    System.out.println("Insert the data of the node : ");
                    int a = scan.nextInt();
                    list.push(a);
                    break;
                }
                case(2):{
                    System.out.println("Insert the data : ");
                    int a = scan.nextInt();
                    list.push(a);
                    break;
                }
                case(3):{
                    System.out.println("Insert the data : ");
                    int a = scan.nextInt();
                    list.append(a);
                    break;
                }
                case(4):{
                    System.out.print("After which value you want to append? :");
                    int a = scan.nextInt();
                    System.out.print("Enter the value : ");
                    int b = scan.nextInt();
                    list.insertAfter(a, b);
                    break;
                }
                case(5):{
                    list.printList();
                    break;
                }
                case (6) : {
                    System.out.print("Enter the number you want to delete : ");
                    int a = scan.nextInt();
                    list.deleteNode(a);
                }
                case(0): {
                    break;
                }
                default:{
                    System.out.println("Enter a valid number");
                    break;
                }

            }
            if(option == 0) break;
        }
    }
}
