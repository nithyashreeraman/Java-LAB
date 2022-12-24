import java.util.Scanner;
public class prime_start_end {
    public static void main(String arg[]){
        int a,b;
        int i,j;
        int count;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the start value");
         a=scan.nextInt();
         System.out.println("Enter the end value");
         b=scan.nextInt();
         System.out.println("Prime numbers:");
         for(i=a;i<b;i++)
         {
             count=0;
             for(j=1;j<=i;j++)
             {
                 if(i%j==0)
                     count+=1;
             }
             if(count==2)
                 System.out.println(i);
             
         }
    }
    
}
