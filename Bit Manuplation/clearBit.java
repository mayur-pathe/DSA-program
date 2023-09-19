import java.util.*;

public class clearBit {
    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        System.out.print("enter ith postion : ");
        int i =sc.nextInt();
        System.out.println(clearIthBit(n, i));

    }
}
