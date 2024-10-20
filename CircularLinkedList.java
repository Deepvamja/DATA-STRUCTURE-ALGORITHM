import java.util.Scanner;

class CircularLinkedList {
    Node head = null;
    Node tail = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert a node at the front
    void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Complete the circular link
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Update tail to point to new head
        }
    }

    // Method to insert a node at the end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Complete the circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Update tail to point to head
        }
    }

    // Method to delete a node from a specified position
    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 1) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        Node current = head;
        Node prev = null;

        for (int i = 1; current != null && i < position; i++) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        if (current == tail) {
            tail = prev;
        }

        prev.next = current.next;

        if (current == tail) {
            tail.next = head;
        }
    }

    // Method to display all nodes
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Main method for menu-driven program
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert a node at the front");
            System.out.println("2. Insert a node at the end");
            System.out.println("3. Delete a node from a specified position");
            System.out.println("4. Display all nodes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at front: ");
                    int dataFront = scanner.nextInt();
                    list.insertAtFront(dataFront);
                    break;
                case 2:
                    System.out.print("Enter data to insert at end: ");
                    int dataEnd = scanner.nextInt();
                    list.insertAtEnd(dataEnd);
                    break;
                case 3:
                    System.out.print("Enter position to delete: ");
                    int position = scanner.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
