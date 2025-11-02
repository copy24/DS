class Queue{
    int queue[]=new int[5];
    int front=-1,rear=-1;
    int n=queue.length;

    public void enqueue(int value){
        if(size()==n){
            System.out.println("Overflow");
        }
        else{
            rear++;
            queue[rear]=value;
        }

        if(rear==n-1){
            rear=-1;
        }
    }
    public void dequeue(){
        if(size()==0){
            System.out.println("Underflow");
        }
        
        else{
            front++;
            queue[front]=0;
        }
        if(front==n-1){
            front=-1;
        }
    }

    public int size(){
        int size=0;
        for(int a:queue){
            if(a!=0){
                size++;
            }
        }
        return size;
    }
    public void show(){
        for(int a:queue){
            if(a!=0){
                System.out.print(a+" ");
            }
        }
    }
}

public class queu{
    public static void main(String[] args) {
        Queue o=new Queue();
        o.enqueue(1);
        o.enqueue(2);
        o.enqueue(3);
        o.enqueue(4);
        o.enqueue(5);
        o.dequeue();
        o.show();
    }
}