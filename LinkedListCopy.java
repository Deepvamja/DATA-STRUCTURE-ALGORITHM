class ListNode {
    int data;
    Node next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCopy {
    public Node copyLinkedList(Node first) {
        if (first == null) {
            return null;
        }

        Node newnode = new Node(first.data);

        Node currentNew = newnode;
        Node currentOld = first.next;

        while (currentOld != null) {
            currentNew.next = new Node(currentOld.data);
            currentNew = currentNew.next;
            currentOld = currentOld.next;
        }

        return newnode;
    }
}
