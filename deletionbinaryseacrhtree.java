class Node {
    int key;
    Node left;
    Node right;

    public Node(int data) {
        key = data;
        left = right = null;
    }
}

class deletionbinaryseacrhtree {
    

    static Node deleteNode(Node root, int x) {
   
        if (root == null) {
            return root;
        }

      
        if (root.key > x) {
            root.left = deleteNode(root.left, x);
        } else if (root.key < x) {
            root.right = deleteNode(root.right, x);
        } else {
            
            if (root.left == null) {
                return root.right;
            }

   
            if (root.right == null) {
                return root.left;
            }


            Node succ = getSuccessor(root);
            root.key = succ.key;
            root.right = deleteNode(root.right, succ.key);
        }
        return root;
    }
 
 
    static Node getSuccessor(Node curr) {
        curr = curr.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }  


    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }


    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(18);

        int x = 15;
        root = deleteNode(root, x);
        inorder(root);
    }
}
