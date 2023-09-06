import java.util.*;

 public class bubbleSort{
    public static void bubbleSort(int arr[]){
        int n=arr.length ;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,5,2,12,1};
        bubbleSort(arr);
        System.out.println("Sorted Array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}