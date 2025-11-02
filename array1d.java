public class array1d{
    int capacity=5;
    int arr[]=new int[capacity];
    int size=0;

    public void insert(int element){
        if(size==capacity){
            System.out.println("Array is full");
        }
        else{
            arr[size]=element;
            size++;
        }
    }

    public void insert_Start(int element){
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=element;
        size++;
    }

    public void insertAt(int element,int index){
        if(size==capacity){
            System.out.println("Array full");
        }
        else if(index>=size){
            insert(element);
        }

        else if(index==0){
            insert_Start(element);
        }

        else{
            for(int i=arr.length-1;i>index;i--){
                arr[i]=arr[i-1];
                
            }
            arr[index]=element;
            size++;
        }
    }

    public void delete_start(){
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        size--;
    }

    public void delete_end(){
        arr[size-1]=0;
        size--;
    }

    public void delete(){
        if(size==0){
            System.out.println("Array is already empty");
        }
        else{
            size--;
            arr[size]=0;
        }
    }

    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        array1d a=new array1d();
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert_Start(5);
        a.delete_end();
        a.delete_start();
        a.insertAt(10,2);
        a.show();

    }
}