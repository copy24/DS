class Node{
    int data;
    Node next;
}

class Linked{
    Node head,tail;
    static int size=0;
    public void insert(int value){
        Node node=new Node();
        node.data=value;

        if(head==null){
            head=tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
        size++;
    }

    public void insert_at(int index,int value){
        Node node=new Node();
        node.data=value;
        Node temp=head;
        if(index>=size){
            insert(value);
        }

        else if(index==0){
            node.next=head;
            head=node;
        }
        else{
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
        }
        size++;
    }

    public void delete_end(){
        if(size==0){
            System.out.println("List Empty");
            return ;
        }

        if(size==1){
            head=null;
            size--;
            return;
        }
        Node temp=head;
        for(int i=1;i<size-1;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }

    public void delete_At(int index){
        Node temp=head;

        if(size==0){

            System.out.println("List empty");
            return;
        }

        if(size==1){
            head=null;
            size--;
        }

        if(index==0){
            head=head.next;
            size--;
        }

        else if(index>=size){
            delete_end();
        }

        else{
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }

    public void traverse(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class singly_linked{
    public static void main(String[] args) {
        Linked l=new Linked();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert_at(0,7);
        l.delete_end();
        l.delete_end();
        l.traverse();
        System.out.println(l.size);
    }
}

































''' Need for linked list

1. Memory Management: When you declare an array, the size of the array is fixed. You cannot change the size of the
array. And there might be a case where you are not able to consume all the space that you have reserved as an array
that means you are wasting a part of your memory or there might be a case where you have consumed all of the space
that was reserved as an array and still you are not able to store your complete data. Linked List manages the memory
efficiently. Size of the Linked list if flexible. Linked List consumes only that much space which is required to store the
data. Whenever data is to be stored in the Linked List, the linked list allocates the memory at the same time so we
shouldn’t worry that our space may remain un-utilized. And whenever a data is deleted from the Linked List it frees
the memory which was consumed by the deleting data and thus allows the memory to be reused, which is not possible
with arrays.
2. Faster Processing: To delete an element from an array we need to shift the elements of the array. In the worst case,
suppose we have an array of size n. Now we want to delete the first element of the array, which means we need to shift
the (n-1) elements of the array to the left which have a time complexity of O(n). Also we waste the memory that was
occupied by the rightmost element. On the other hand, deleting an element from Linked List is quite simple, we just
need to change the address held by the two pointers which have O(1) time complexity. Also the memory occupied by
this element can be freed so that it can be re-utilized.
Single Linked List
Each Node of the singly list consists of two parts:
● First part of the singly linked list Node contains the information to be stored.
● The second part of the singly linked list Node contains the address of either its next Node or its
previous Node and is a pointer.
● Head is a pointer that stores the address of the first Node of the list. Tail is also a pointer that holds
the address of the last Node of the list.
● Each Node of the singly linked list stores the address of its next Node and in that way all the data of
the singly linked list gets linked to each other.

Representation of Linked List Experiment

Insertion of elements into Singly Linked List
Two cases may arise when we want to insert data at the front.

Case – 1 : When the list is empty i.e. head = NULL

Here we can simply do head = tail = newNode(pointer)

Case – 2 : When list contains some entries i.e. head != NULL

· Insertion at Front
· Insertion at End
· Insertion after a Node

Insertion of node in Linked List (Case 1)
Before insertion, both head and tail were null pointers.
After insertion, both head and tail are pointing to the node a .i.e. store node address of a.
Insertion of node in Linked List (Case 2a)
Insertion of node in Linked List (Case 2a)
Before insertion, both head and tail were pointing to node a.

Since insertion is at the head hence, the head is pointing to the newnode(b) and the next of b is pointing to a. The tail
will still point to a.

Insertion of node in Linked List (Case 2b)

Before insertion, both head and tail were pointing to node a.
Since insertion is at the tail hence, the tail is pointing to the newnode(b) and the next of b is null. The head will still
point to a.

Insertion of node in Linked List (Case 2c)

We have inserted node e after node c in the linked list and updated the next pointers of c and e.
The next of c which was initially pointing to d is now pointing to the newnode(e) and since, the node d has to be a part
of the linked list, the next of e is pointing to d.
Insertion of elements into Doubly Linked List
Insertion in doubly linked lists is similar to that of insertion in singly linked list, unlike there need to be a change in
data type we use, we need to add an extra element to the data type.
Deletion of elements from Doubly Linked List
There is no change in implementation of deletion of a node, it is similar to that of in singly linked list unlike parent of
the child of deleted node must be added.
'''