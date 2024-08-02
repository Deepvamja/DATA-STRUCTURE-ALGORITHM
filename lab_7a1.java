
class Stack {
    int MAX = 1000;
    int top;
    int a[] = new int[MAX];
    int i = 0;

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    public void push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peep() {
        if (top - i + 1 <= 0) {
            System.out.println("Stack Underflow");
            return MAX;

        } else {
            int x = a[top - i + 1];
            return x;
        }

    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}

class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peep());
        System.out.print("Elements present in stack :");
        s.print();
    }
}
