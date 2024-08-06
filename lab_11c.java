

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class LinkedList {
    Node head;

  
    public LinkedList() {
        this.head = null;
    }

   
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

  
    public void removeDuplicates() {
        Node current = head;
        while (current != null) {
            Node runner = current;
           
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

   
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


public class lab_11c {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(2);
        list.append(4);
        list.append(1);
        list.append(5);

        System.out.println("Original linked list:");
        list.display();

        list.removeDuplicates();

        System.out.println("Linked list after removing duplicates:");
        list.display();
    }
}


