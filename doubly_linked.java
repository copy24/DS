class Node{
    int data;
    Node prev,next;
}

class Double{
    Node head,tail;

    public void insert_end(int value){
        Node node=new Node();
        node.data=value;

        if(head==null){
            head=tail=node;
        }
        else{
            node.prev=tail;
            tail.next=node;
            tail=node;
        }
    }

    public void insert_at(int index,int value){
        Node temp=head;
        Node node=new Node();
        node.data=value;

        if(index>=size()){
            insert_end(value);
        }

        else if(index==0){
            node.next=head;
            head.prev=node;
            head=node;
        }
        else{
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            node.next=temp.next;
            node.prev=temp;
            temp.next.prev=node;
            temp.next=node;
        }
    }

    public void delete_end(){
        if(size()==0){
            System.out.println("List Empty");
            return;
        }

        if(size()==1){
            head=tail=null;
        }

        else{
            tail=tail.prev;
            tail.next=null;
        }
    }

    public void delete_at(int index){
        Node temp=head;
        if(size()==0){
            System.out.println("List Empty");
            return;
        }

        if(size()==1){
            head=tail=null;
            return;
        }

        if(index<=0){
            head=head.next;
            head.prev=null;
        }

        else if(index>=size()){
            delete_end();
        }

        else{
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
        }
    }

    public int size(){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }

    public void show(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void show_reverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
}

public class doubly_linked{
    public static void main(String[] args) {
        Double dl=new Double();
        dl.insert_end(1);
        dl.insert_end(2);
        dl.insert_end(3);
        dl.insert_end(4);
        dl.delete_at(0);
        dl.delete_at(0);
        dl.show();
        dl.show_reverse();
    }
}