import java.util.Scanner;
public class Array1 {
     public static void main(String arg[]){
         int ar[],i,n;
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter the array size");
         n=scan.nextInt();
         ar=new int[n];
         System.out.println("The array size is " + ar.length);
         System.out.println("Enter values:");
         for(i=0;i<n;i++)
          ar[i]=scan.nextInt();
         for(int j:ar)
             System.out.print(j*j + " ");
     }
    
}
