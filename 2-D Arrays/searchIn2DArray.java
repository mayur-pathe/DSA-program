import java.util.*;
public class searchIn2DArray {
    public static boolean searchElement(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at cell ("+ i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found:");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=3;
        int m=3;
        int matrix[][] = new int [n][m];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        searchElement(matrix,5);
    }
}
