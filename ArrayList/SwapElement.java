import java.util.ArrayList;
import java.util.Collections;
public class SwapElement {
    public static void swap(ArrayList<Integer> list,int idx1 , int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp );
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(4);
        int idx1 =2,idx2=4;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);

        //sorting arraylist
        Collections.sort(list);
        System.out.println("Sorted list is ");
        System.out.println(list);

        //reverse the arraylist
        Collections.reverse(list);
        System.out.println("reverse list is ");
        System.out.println(list);
    }
}
