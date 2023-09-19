import java.util.*;

public class oddEven {
    public static void check(int n){
        int k = n&1;
        if(k==1){
            System.out.println("no. is odd");
        }else{
            System.out.println("no. is even");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. :");
        int n = sc.nextInt();
        check(n);

    }
}
