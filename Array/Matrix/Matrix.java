import java.util.Scanner;
public class Matrix {
     public static void main(String arg[]){
         Scanner scan=new Scanner(System.in);
         int mat[][]=new int[5][];
         int i,j,n;
         for(i=0;i<5;i++)
             mat[i]=new int[i+1];
         for(i=0;i<5;i++){
             for(j=0;j<i+1;j++)
                 System.out.print(mat[i][j] + " ");
             System.out.println();
         }
     }
    
}
