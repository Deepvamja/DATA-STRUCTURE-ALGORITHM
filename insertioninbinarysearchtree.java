class Node {
    int key;
    Node left;
    Node right;

    public Node(int data)
    {
        key = data;
        left = right = null;
    }
}

class insertioninbinarysearchtree {


    static Node insert(Node root, int key)
    {

   
        if (root == null)
            return new Node(key);

  
        if (root.key == key)
            return root;

     
        if (key < root.key)
            root.left = insert(root.left, key);
        

        else {
            root.right = insert(root.right, key);
        }
        

       
        return root;
    }

   
    static void inorder(Node root)
    {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args)
    {
        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 60);
        root = insert(root, 80);

        
        inorder(root);
    }
}
