public class printInc {
    public static void IncOrder(int n){
        if(n==1){
            System.out.print(n+" "); 
            return;   
        }
        IncOrder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        IncOrder(n);
    }
}
