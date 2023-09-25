public class firstOccurence {
    public static int FirstOccured(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccured(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,4,8,9,1,2,4};
        System.out.println(FirstOccured(arr, 4, 0));
    }
}
