import java.util.Scanner;
public class Maxmin {
    public static void main(String arg[]){
        
        int i;
        int a[]=new int[10];
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 10 int");
        for(i=0;i<10;i++)
        {
            a[i]=scan.nextInt();
            
        }
        
        int max=a[0];
        for(i=1;i<10;i++)
        {
            if(a[i]>max){
                max=a[i];
            }
        }
       System.out.println("The maximum is " + max);  
       
       int min=a[0];
        for(i=1;i<10;i++)
        {
            if(a[i]<min){
                min=a[i];
            }
        }
       System.out.println("The minimum is " + min); 
    }
}
    
        
            
       
   
        
