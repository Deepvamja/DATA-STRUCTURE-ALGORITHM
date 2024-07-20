 import java.util.Scanner;

class Node {
    public Node next = null;
    int data;    
    Node link; 
    
    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

// LinkedList class to manage operations on the linked list
 class LinkedList {
    public Node first=null;
    public Node save; 
    
    // Method to insert a node at the beginning of the linked list
    void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.link = first;
        first = newNode;
        System.out.println("Node inserted at the front successfully.");
    }

    // Method to insert a node at the end of the linked list
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            Node last = first;
            while (last.link != null) {
                last = last.link;
            }
            last.link = newNode;
        }
        System.out.println("Node inserted at the end successfully.");
    }

    // Method to display all nodes in the linked list
    void display() {
        Node current = first;
        if (current == null) {
            System.out.println("Linked list is empty.");
        } else {
            System.out.print("Linked list nodes: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.link;
            }
            System.out.println();
        }
    }

    void deleteatfirst(int data){
        Node newNode = new Node(data);
  
        if (first == null) {
            System.out.println("Linked list is empty.");   
        }
        first = newNode;

    }
}

// Main class to run the program
  public class Linkedist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int choice, data;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert node at the front");
            System.out.println("2. Insert node at the end");
            System.out.println("3. Display all nodes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data for the node: ");
                    data = sc.nextInt();
                    list.insertAtFront(data);
                    break;
                case 2:
                    System.out.print("Enter data for the node: ");
                    data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}


