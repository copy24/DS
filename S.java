class stack {
    int capacity=6;
    int stack[] = new int[capacity];
    // int size = 0;
    int top = 0;

    public void push(int value) {
        if (top == capacity) {
            System.out.println("Stack Overflow");
        } else {
            stack[top] = value;
            top++;
        }
    }

    public void pop() {
        if (top == 0) {
            System.out.println("Stack underflow");
        }

        else {
            top--;
            System.out.println(stack[top]+" removed ");
            stack[top] = 0;
        }
    }

    public void show() {
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i]+" ");
        }
        System.out.println("");
    }

}

public class S {
    public static void main(String[] args) {
        stack o = new stack();
        o.push(1);
        o.push(2);
        o.push(5);
        o.push(7);
        o.push(18);
        o.push(10);
        o.pop();
        o.pop();
        o.show();
    }
}