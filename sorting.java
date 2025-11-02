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
