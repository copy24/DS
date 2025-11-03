public class sorting {
    public static void divide(int arr[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            divide(arr, l,mid);
            divide(arr, mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    public static void merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int larr[]=new int[n1];
        int rarr[]=new int[n2];

        for(int x=0;x<n1;x++){
            larr[x]=arr[l+x];
        }
        for(int x=0;x<n2;x++){
            rarr[x]=arr[mid+x+1];
        }

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(larr[i]<=rarr[j]){
                arr[k]=larr[i];
                i++;
            }
            else{
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }

    public static void quick_sort(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr, low, high);

            quick_sort(arr, low, pi-1);
            quick_sort(arr, pi+1, high);
        }
    }

    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int j=low-1;

        for(int i=low;i<high;i++){
            if(arr[i]<pivot){
                j++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[high];
        arr[high]=arr[j+1];
        arr[j+1]=temp;
        return j+1;
    }

    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }

    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={6,7,5,2,3,1,4};
       divide(arr, 0, arr.length-1);
       // insertion(arr);
       // merge(arr, 0, (arr.length-1)/2, arr.length-1);
        // quick_sort(arr, 0, arr.length-1);
        // selection(arr); 
        for(int a:arr){
            System.out.print(a+" "); 
        }
    }
}












































'''Sorting overview
Sorting arranges elements in non-decreasing (or non-increasing) order. Sorting is fundamental
in algorithms — it helps searching, merging, and many higher-level algorithms.
Algorithms covered
-----------------------------------------------------------------------------
1. Selection Sort
 Idea: Repeatedly find the minimum (or maximum) element from the unsorted portion and
place it at the beginning.
 Stable? No (standard selection sort is not stable).
 Time complexity: Best = Worst = Average = O(n²).
 Space: O(1) (in-place).
 Use-case: Small arrays, when writes are expensive selection does fewer swaps.
o Pseudo Code or Basic Logic –
for i = 0 to n-2
minIndex = i
for j = i+1 to n-1
if A[j] &lt; A[minIndex]
minIndex = j
swap A[i] and A[minIndex]
 Steps
1. Start with i = 0 — the beginning of the unsorted portion.
2. Assume the smallest item in the unsorted part is at minIndex = i.

3. Scan the rest of the array (j = i+1 to n-1) to find an actual minimum; if A[j] is
smaller update minIndex.
4. After the inner scan, minIndex holds the index of the smallest element in the
unsorted part.
5. Swap A[i] with A[minIndex] to move that smallest element into the sorted portion.
6. Increment i and repeat until the array is sorted.
----------------------------------------------------------------------------
2. Insertion Sort
 Idea: Build the sorted array one element at a time by inserting each new element into its
correct place among previously sorted elements.
 Stable? Yes.
 Time complexity: Best = O(n) (already sorted), Average/Worst = O(n²).
 Space: O(1) (in-place).
 Use-case: Small arrays, nearly-sorted arrays, as a base-case for divide-and-conquer
sorts.
o Pseudo Code or Basic Logic –
for i = 1 to n-1
key = A[i]
j = i - 1
while j &gt;= 0 and A[j] &gt; key
A[j+1] = A[j]
j = j - 1
A[j+1] = key
o Steps
1. Take key = A[i] (the element to insert into the sorted left side).
2. Initialize j = i - 1 to start comparing with the element immediately left of key.
3. While j &gt;= 0 and A[j] &gt; key, shift A[j] one position right to A[j+1] — this
makes room for key.
4. Decrease j each time you shift until you find the correct spot.
5. Insert key at A[j+1] (the first position greater than key was skipped).
6. Repeat for all i — the left part grows as a sorted subarray.
----------------------------------------------------------------------------
3. Merge Sort
 Idea: Divide array into halves, sort each half recursively, then merge sorted halves.
 Stable? Yes (if merge preserves order).
 Time complexity: Best/Average/Worst = O(n log n).
 Space: O(n) auxiliary (for merging).
 Use-case: Large datasets, guaranteed O(n log n) performance, external sorting.

o Pseudo Code–
mergeSort(A):
if length(A) &lt; 2
return
mid = floor(length(A) / 2)
left = A[0 .. mid-1]
right = A[mid .. end]
mergeSort(left)
mergeSort(right)
merge(left, right, A)
merge(left, right, A):
i = 0; j = 0; k = 0
while i &lt; length(left) and j &lt; length(right)
if left[i] &lt;= right[j]
A[k] = left[i]; i = i + 1
else
A[k] = right[j]; j = j + 1
k = k + 1
while i &lt; length(left)
A[k] = left[i]; i = i + 1; k = k + 1
while j &lt; length(right)
A[k] = right[j]; j = j + 1; k = k + 1
o Steps :
1. Base case: if the array has fewer than 2 elements it is already sorted — return.
2. Divide: compute mid and split A into left and right.
3. Conquer: recursively call mergeSort on left and right to sort them.
4. Merge: use three pointers i (left), j (right), k (destination).
5. Compare left[i] and right[j] — place the smaller into A[k], advance that
pointer and k.
6. After one side is exhausted, copy any remaining elements from the other side into
A.
7. Result: A contains the merged, sorted result of the two sorted halves.
----------------------------------------------------------------------------
4. Quick Sort
 Idea: Pick a pivot, partition array into elements less than pivot and greater than pivot,
recursively sort partitions.
 Stable? No (standard).
 Time complexity: Average = O (n log n), Worst = O(n²) (bad pivot choices). With random
pivot or median-of-three reduces chance of worst -case.
 Space: O (log n) average recursion stack (in-place partition).
 Use-case: General-purpose sort; fastest in practice for many datasets.
o Pseudo Code–
quickSort(A, low, high):
if low &lt; high
p = partition(A, low, high)
quickSort(A, low, p - 1)
quickSort(A, p + 1, high)
partition(A, low, high):
pivot = A[high]
i = low - 1
for j = low to high - 1
if A[j] &lt;= pivot
i = i + 1
swap A[i] and A[j]
swap A[i + 1] and A[high]
return i + 1
o Steps:
1. Recursive guard: call quickSort only when low &lt; high.
2. Partition: choose a pivot (here A[high]).
3. Initialize i = low - 1 — marks the boundary of elements &lt;= pivot.
4. Iterate j from low to high - 1. For each A[j]:
a. If A[j] &lt;= pivot, increment i and swap A[i] with A[j] (this grows the
&quot;≤ pivot&quot; region).

5. After the loop, place pivot in its correct position by swapping A[i+1] with
A[high]. Now index i+1 is pivot&#39;s final place.
6. Return partition index p = i+1. Elements left of p are &lt;= pivot, right of p are &gt;
pivot.
7. Recursively sort left (low..p-1) and right (p+1..high) partitions.'''