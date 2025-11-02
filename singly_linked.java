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