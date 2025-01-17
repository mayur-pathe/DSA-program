import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Adding element to list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //getting element from list
        int element = list.get(2);
        System.out.println(element);

        //removing element from list
        list.remove(4);
        System.out.println(list);

        //set element at index
        list.set(0,5);
        System.out.println(list);

        //contains element or not 
        System.out.println(list.contains(5));
        System.out.println(list.contains(11));

        //length of list
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //print reverse list
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
