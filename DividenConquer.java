//MERGE SORT USING DIVE AND CONQUER ALGORITHM

public class DividenConquer{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void mergeSort( int arr[], int si, int ei){
        //kaam
        int mid= si +(ei +si)/2;
        mergeSort(arr, si, mid);// left part
        mergeSort(arr, mid, ei);// right part
        merge(arr,si,mid,ei);
    }
    public static void merge( int arr[], int si, int mid, int ei){
        int temp[] = new int[ei -si + 1];
        int i = si;// iterator for left part
        int j = mid+1;// iterator for right part 
        int k = 0;//iterator for the temporary array 

        while (i<= mid && j <=ei) {
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;k++;
            }else{
                temp[k] = arr[j];
                j++;k++;
            }
            k++;
        }

        //left part
        while(i<=mid){
            temp[k++]= arr[i++];
        }

         //right part
        while(j<=mid){
            temp[k++]= arr[j++];
        }

        //copy temporary to original array
        for(k=0; i=si; k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main (String args[]){
        int arr[]={ 6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
    }
}