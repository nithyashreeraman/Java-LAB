import java.util.Scanner;
public class MidProperty {
   public static void main(String arg[]){
       int a[]=new int[10];
       int i;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 10 int");
        for(i=0;i<10;i++)
        {
            a[i]=scan.nextInt();
            
        }
        System.out.println("Mid property elements:");
        for(i=1;i<9;i++)
        {
            if(a[i]>a[i-1] && a[i]<a[i+1])
                System.out.println(a[i] + " ");
            
        }
   
   
   }
}
