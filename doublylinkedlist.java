
    import java.util.Scanner;
 

class DoublyLinkedList {
    private Node head;
    private Node tail;

    private class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Method to insert a node at the front of the list
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Method to insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Method to delete a node from the specified position
    public void deleteNodeAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (position < 0) {
            System.out.println("Invalid position.");
            return;
        }
        
        Node current = head;
        int count = 0;
        
        // Traverse to the specified position
        while (current != null && count < position) {
            current = current.next;
            count++;
        }
        
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
    }

    // Method to display all nodes in the list
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public class doublylinkedlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        
        while (true) {  
            System.out.println("Menu:");
            System.out.println("1. Insert node at the front");
            System.out.println("2. Delete node from a specified position");
            System.out.println("3. Insert node at the end");
            System.out.println("4. Display all nodes");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at the front: ");
                    int frontValue = scanner.nextInt();
                    list.insertAtFront(frontValue);
                    break;
                case 2:
                    System.out.print("Enter position of node to delete: ");
                    int position = scanner.nextInt();
                    list.deleteNodeAtPosition(position);
                    break;
                case 3:
                    System.out.print("Enter value to insert at the end: ");
                    int endValue = scanner.nextInt();
                    list.insertAtEnd(endValue);
                    break;
                case 4:
                    System.out.println("Nodes in the list:");
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

}
