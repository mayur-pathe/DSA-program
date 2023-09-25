public class printFibonacci {
    public static int Nthfib(int n){
        if(n<=1){
            return n;
        }
        
        int fibofn = Nthfib(n-1)+Nthfib(n-2);
        return fibofn;
    }
    public static void main(String[] args) {
        int n =8;
        System.out.println(Nthfib(n));
    }
}
