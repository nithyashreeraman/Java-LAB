import java.util.Scanner;
public class Sorting {
     public static void main(String arg[]){
          int i,temp;
        int a[]=new int[10];
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 10 int");
        for(i=0;i<10;i++)
        {
            a[i]=scan.nextInt();
            
        }
        
        for(i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
                }
        }
        System.out.println("Ascending order= ");
        for(i=0;i<10;i++)
        {
           System.out.print(a[i] + " "); 
        }
     }
    
}
