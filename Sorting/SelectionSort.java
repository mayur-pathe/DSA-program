
import java.util.*;
public class SelectionSort {
    public static void SelectionSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minPos = i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,2,8,1,5};
        SelectionSort(arr);
        System.out.println("Sorted Array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
