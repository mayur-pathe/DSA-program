import java.util.*;

public class setBit {
    public static int setIthBit(int n , int i){
        int bitMask = (1<<i);
        return n|bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        System.out.print("enter ith postion : ");
        int i =sc.nextInt();
        System.out.println(setIthBit(n, i)); 

    }
}
