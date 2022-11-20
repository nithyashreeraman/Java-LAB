import java.util.Scanner;
public class Normal_star {
     public static void main(String arg[]){
         int n;
         int i,j;
         Scanner scan= new Scanner(System.in);
         System.out.println("Enter the no of rows:");
         n=scan.nextInt();
         for(i=0;i<n;i++)
         {
             for(j=0;j<=i;j++)
             {
              System.out.print("*");
             }
             System.out.println();
         }
     }
    
}
