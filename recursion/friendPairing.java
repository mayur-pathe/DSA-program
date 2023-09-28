public class friendPairing {
    public static int ways(int n){
        if(n==1 || n==2){
            return n;
        }
        //single
        int fnm1 = ways(n-1);
        //pair
        int fnm2 = ways(n-2);
        int totalWays = fnm1 + (n-1)*fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(ways(n));
    }
}
