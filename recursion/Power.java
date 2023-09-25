public class Power {
    public static int xPowN(int x,int n){
        if(n==1){
            return x;
        }
        return x*xPowN(x, n-1);

    }
    public static void main(String[] args) {
        int x =2;
        int n =10;
        System.out.println(xPowN(x, n));
    }
}
