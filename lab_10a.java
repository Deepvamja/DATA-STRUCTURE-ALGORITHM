import java.util.Scanner;

// Node class represents each node in the linked list
class Node {
    int data;    // data stored in the node
    Node next;   // reference to the next node in the list

    // Constructor to create a new node with given data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to manage operations on the linked list
class LinkedList {
    private Node head;  // head of the linked list

    // Constructor to initialize an empty linked list
    LinkedList() {
        this.head = null;
    }

    // Method to insert a node at the beginning of the linked list
    void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Node inserted at the front successfully.");
    }

    // Method to insert a node at the end of the linked list
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Node inserted at the end successfully.");
    }

    // Method to display all nodes in the linked list
    void display() {
        Node current = head;
        if (current == null) {
            System.out.println("Linked list is empty.");
        } else {
            System.out.print("Linked list nodes: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

// Main class to run the program
public class lab_10a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int choice, data;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert node at the front");
            System.out.println("2. Insert node at the end");
            System.out.println("3. Display all nodes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data for the node: ");
                    data = scanner.nextInt();
                    list.insertAtFront(data);
                    break;
                case 2:
                    System.out.print("Enter data for the node: ");
                    data = scanner.nextInt();
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

        scanner.close();
    }
}
