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







































''' Stack:- A Stack is a linear data structure that follows a particular order in which the operations
are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out). LIFO
implies that the element that is inserted last, comes out first and FILO implies that the element
that is inserted first, comes out last.It is an ordered list of elements n , such that n&gt;0 in which all
insertions (PUSH) and deletions (POP) are made at one end called the top.

Queue: Queue is a data structure which works in First In First Out manner i.e. FIFO. The data
which comes first goes first and which comes at last goes last. Data is added at one end and
removed from the other end called front and rear of Queue respectively.

Basic Operations on Stack:
● push() to insert an element into the stack
● pop() to remove an element from the stack
● top() Returns the top element of the stack.
● isEmpty() returns true if stack is empty else false.
● isFull() returns true if the stack is full else false.

Algorithm for Push (Stack):
Step 1: Check if the stack is full or not.
Step 2: If the stack is full, then display an error message and terminate the algorithm.
Step 3: If the stack is not full, then increment the top pointer by 1.
Step 4: Insert the new element at the position pointed by the top pointer.
Step 5: Return the updated stack.

Algorithm for Pop (Stack):
Step 1: Check if the stack is empty or not.
Step 2: If the stack is empty, then display an error message and terminate the algorithm.
Step 3: If the stack is not empty, then read the value at the position pointed by the top pointer.
Step 4: Decrement the top pointer by 1.
Step 5: Return the updated stack.

Pushing into a Stack

Popping from a Stack

Basic operations for Queue:
● enqueue() - Insertion of elements to the queue.
● dequeue() - Removal of elements from the queue.
● getFront()- Acquires the data element available at the front node of the queue without
deleting it.
● getRear() - This operation returns the element at the rear end without removing it.
● isFull() - Validates if the queue is full.
● isEmpty() - Checks if the queue is empty.
● size() - This operation returns the size of the queue i.e. the total number of elements it
contains.

Algorithm for Enqueue (Queue):
Step 1: Check if the queue is full or not.
Step 2: If the queue is full, then display an error message and terminate the algorithm.
Step 3: If the queue is not full, then increment the rear pointer by 1.
Step 4: Insert the new element at the position pointed by the rear pointer.
Step 5: Return the updated queue.
Algorithm for Dequeue (Queue):
Step 1: Check if the queue is empty or not.
Step 2: If the queue is empty, then display an error message and terminate the algorithm.
Step 3: If the queue is not empty, then read the value at the position pointed by the front pointer.
Step 4: Increment the front pointer by 1.
Step 5: Return the updated queue

Enqueue Operation -- diagram
```

Dequeue Operation -- diagram '''  