public class printFac {
    public static int Factorial(int n){
        if(n==0){
            return 1;
            
        }
        
        int fn = n*Factorial(n-1); 
        return fn;
    }
    public static void main(String[] args) {
        int n =4;
        System.out.println(Factorial(n));
    }
}
