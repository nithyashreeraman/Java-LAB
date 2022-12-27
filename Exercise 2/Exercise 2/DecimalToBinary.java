import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String arg[]){
        int b[]=new int[10];
        int n;
        Scanner scan= new Scanner(System.in);
         System.out.println("Enter the decimal number:");
         n=scan.nextInt();
         
         int i=0;
         while(n>0)
         {
             b[i++]= n%2;
             n=n/2;
             
         }
         System.out.print("Binary number:");
         for(int k=i-1;k>=0;k--)
         System.out.print(b[k]);
         
    }
}
