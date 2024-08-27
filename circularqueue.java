
    import java.util.Scanner;

public class circularqueue {

    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor to initialize the circular queue
    public circularqueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Method to insert an element into the circular queue
    public void insert(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert element.");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = element;
            size++;
            System.out.println(element + " inserted into the queue.");
        }
    }

    // Method to delete an element from the circular queue
    public void delete() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot delete element.");
        } else {
            int removedElement = queue[front];
            front = (front + 1) % capacity;
            size--;
            System.out.println(removedElement + " removed from the queue.");
        }
    }

    // Method to display all elements of the circular queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }

    // Method to check if the queue is full
    private boolean isFull() {
        return size == capacity;
    }

    // Method to check if the queue is empty
    private boolean isEmpty() {
        return size == 0;
    }

    // Main method to provide a menu-driven interface
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the capacity of the circular queue: ");
        int capacity = scanner.nextInt();
        
        circularqueue queue = new circularqueue(capacity);

        while (true) {
            System.out.println("\nCircular Queue Operations Menu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int element = scanner.nextInt();
                    queue.insert(element);
                    break;
                case 2:
                    queue.delete();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


