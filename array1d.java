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



























'''Arrays are fundamental data structures used to store a collection of elements of the same data type
in contiguous memory locations. They provide a way to organize and access multiple values using a
single variable name and an index. Each element in an array can be accessed directly using its
index, starting from 0.

A Java array variable is declared just like you would declare a variable of the desired type, except
you add [] after the type. Here is a simple Java array declaration example:
int[] intArray;
You can use a Java array as a field, static field, a local variable, or parameter, just like any other
variable. An array is simply a variation of the data type. Instead of being a single variable of that
type, it is a collection of variables of that type.
Here are a few more Java array declaration examples:

String[] stringArray;
MyClass[] myClassArray;

Instantiating an Array in Java
When you declare a Java array variable you only declare the variable (reference) to the array itself.
The declaration does not actually create an array. You create an array like this:

int[] intArray;
intArray = new int[10];

Java Array Length Cannot Be Changed
Once an array has been created its size cannot be resized. In some programming languages (e.g.
JavaScript) arrays can change their size after creation, but in Java an array cannot change its size
once it is created. If you need an array-like data structure that can change its size, you should use a
List, or you can create a resizable Java array. In some cases you can also use a Java RingBuffer
which, by the way, is implemented using a Java array internally.
Accessing Java Array Elements
Each variable in an Java array is also called an &quot;element&quot;. Thus, the example shown earlier created
an array with space for 10 elements, and each element is a variable of type int.
Each element in the array has an index (a number). You can access each element in the array via its
index. Here is an example:

intArray[0] = 0;
int firstInt = intArray[0];

Array Length
You can access the length of an array via its length field. Here is an example:

int[] intArray = new int[10];
int arrayLength = intArray.length;

In this example the variable named arrayLength will contain the value 10 after the second line of
code has been executed.

Multidimensional Java Arrays
The examples shown above all created arrays with a single dimension, meaning elements with
indexes going from 0 and up. It is, however, possible to create arrays where each element has two or
more indexes.
You create a multidimensional array in Java by appending one set of square brackets ([]) per
dimension you want to add. Here is an example that creates a two-dimensional array:

int[][] intArray = new int[10][20];'''