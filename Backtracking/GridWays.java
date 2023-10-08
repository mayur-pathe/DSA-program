public class GridWays {
    public static int totalWays(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){//last cell condition
            return 1;
        }else if(i==n || j==n){//boundary condition
            return 0;
        }
        //down
        int w1 = totalWays(i+1, j, n, m);
        //right
        int w2 = totalWays(i, j+1, n, m);
        return w1+ w2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        
        System.out.println( totalWays(0, 0, n, m));
    }
}
