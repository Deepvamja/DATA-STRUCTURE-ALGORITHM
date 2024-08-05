
   
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


    public void mergeSort() {
        head = mergeSort(head);
    }


    private Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head; 
        }

      
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);


        Node sortedList = merge(left, right);
        return sortedList;
    }

    private Node merge(Node left, Node right) {
        Node result = null;
        

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

      
        if (left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        return result;
    }

   
    private Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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


public class sortlinkedlist {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(8);
        list.append(2);
        list.append(5);
        list.append(3);
        list.append(1);
        list.append(7);

        System.out.println("Original linked list:");
        list.display();

        list.mergeSort();

        System.out.println("Sorted linked list:");
        list.display();
    }
}


