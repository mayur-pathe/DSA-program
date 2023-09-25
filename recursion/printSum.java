public class printSum {
    public static int NaturalSum(int n ){
        if(n==1){
            return 1;
        }
        int sum = n+NaturalSum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int  n =5;
        System.out.println(NaturalSum(n));
    }
}
