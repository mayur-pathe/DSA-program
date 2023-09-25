public class lastOccurence {
    public static int LastOccured(int arr[],int key ,int i){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return LastOccured(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[]={8,2,4,5,6,3,8,2};
        int i = arr.length-1;
        System.out.println(LastOccured(arr, 8, i));
    }
}
