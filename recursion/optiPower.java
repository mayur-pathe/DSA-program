public class optiPower {
    public static int Power(int x,int n){
        if(n==1){
            return x;
        }
        int halfPow = Power(x, n/2)*Power(x,n/2);
        if(n%2!=0){
            halfPow=halfPow*x;
        }
        return halfPow;
    }
    public static void main(String[] args) {
        int x =2;
        int n=10;
        System.out.println(Power(x, n));
    }
}
