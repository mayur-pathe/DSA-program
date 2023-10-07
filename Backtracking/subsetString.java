public class subsetString {
    public static void ways(String str , String ans , int i){
        //base case 
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes choice
        ways(str, ans+str.charAt(i), i+1);
        //no choice
        ways(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        ways(str, "", 0);
    }
}
