
    class Node {
        int data;
        Node next;
        Node top;
    
        Node(int data) {
            this.data = data;
            this.next = null;
          
        }
    }
    
    
    class Stack {
        private Node top;
    
        public Stack() {
            this.top = null;
        }
    
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }
    
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            }
            int poppedData = top.data;
            top = top.next;
            return poppedData;
        }
    
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                
            }
            return top.data;
        }
    
        public boolean isEmpty() {
            return top == null;
        }
    
        public void display() {
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
        
        public  class lab_11a {

        public static void main(String[] args) {
            Stack stack = new Stack();
            stack.push(10);
            stack.push(20);
            stack.push(30);
    
            System.out.println("Current Stack:");
            stack.display();
    
            System.out.println("Top element: " + stack.peek()); 
    
            System.out.println("Popped element: " + stack.pop()); 
            System.out.println("Current Stack:");
            stack.display();
    
            System.out.println("Is stack empty? " + stack.isEmpty()); 
        }
    }
    

    

