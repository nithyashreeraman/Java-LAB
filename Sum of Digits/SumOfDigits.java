import java.util.Scanner;
public class SumOfDigits {
    public static void main(String arg[]){
        int s=0;
        int n;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter an int");
         n=scan.nextInt();
         
         while(n>0 || s>9)
         {
             if(n==0){
                 n=s;
                 s=0;
             }
             
             
             s += n%10;
             n/=10;
         }
         
         System.out.println(s);
    }
    
}
