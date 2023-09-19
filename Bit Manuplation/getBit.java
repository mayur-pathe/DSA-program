import java.util.*;

public class getBit {
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        System.out.print("enter ith postion : ");
        int i =sc.nextInt();
        System.out.println(getIthBit(n, i)); 

    }
}
