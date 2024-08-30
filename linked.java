 import java.util.Scanner;

class Node {
    int data;
    Node link; 

   public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class linked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter data for the node: ");
        int data = sc.nextInt();
        
        Node newnode = new Node(data);
        
        System.out.println("\nNode Details:");
        System.out.println("Data: " + newnode.data);
        if (newnode.link != null) {
            System.out.println("Next Node: " + newnode.link.data);
        } else {
            System.out.println("Next Node: null");
        }

        sc.close();
    }
}


