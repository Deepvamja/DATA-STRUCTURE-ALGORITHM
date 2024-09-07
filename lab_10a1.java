
import java.util.Scanner;

// Node class represents each node in the singly linked list
class Node {
    int data; // data stored in the node
    Node next; // reference to the next node in the list

    // Constructor to create a new node with given data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Main class to run the program
public class lab_10a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read data for the node
        System.out.print("Enter data for the node: ");
        int data = scanner.nextInt();

        // Create a new node with the entered data
        Node node = new Node(data);

        // Print the node
        System.out.println("\nNode Details:");
        System.out.println("Data: " + node.data);
        if (node.next != null) {
            System.out.println("Next Node: " + node.next.data);
        } else {
            System.out.println("Next Node: null");
        }

        scanner.close();
    }
}
