public class tilingProb {
    public static int Ways(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1 = Ways(n-1);
        //horizontal choice
        int fnm2 = Ways(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        int n=4;
        
        System.out.println(Ways(n));
    }
}
