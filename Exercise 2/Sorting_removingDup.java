import java.util.Scanner;
public class Sorting_removingDup {
    public static void main(String arg[]){
          int i,temp;
        int a[]=new int[10];
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 10 int");
        for(i=0;i<10;i++)
        {
            a[i]=scan.nextInt();
            
        }
        
        for(i=0;i<9;i++)
        {
            int k=i;
            for(int j=i+1;j<10;j++)
            {
                if(a[k]>a[j])
            
                {
                
                    k=j;
            
                }
            }
           
             temp=a[k];
            a[k]=a[i];
            a[i]=temp;

        }
        System.out.println("Ascending order= ");
        for(i=0;i<10;i++)
        {
           System.out.print(a[i] + " "); 
        }
     }
    
}
