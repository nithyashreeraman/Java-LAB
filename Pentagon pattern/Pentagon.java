import java.util.Scanner;
public class Pentagon {
    public static void main(String arg[]){
        int n;
         int i,j;
         Scanner scan= new Scanner(System.in);
         System.out.println("Enter the no of rows:");
         n=scan.nextInt();
         for(i=0;i<n;i++)
         {
             for(j=n-1;j>i;j--)
             {
                 System.out.print(" ");
             }
             for(j=0;j<=i;j++)
             {
                 System.out.print("* ");
             }
             
             System.out.println();
         }
    }
}
