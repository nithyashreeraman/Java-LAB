import java.util.Scanner;
public class Search {
    public static void main(String arg[]){
        
        int i;
        int a[]=new int[10];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter");
        for(i=0;i<10;i++)
        a[i]=scan.nextInt();
        int search,flag=0;
        System.out.println("Enter search element");
        search=scan.nextInt();
        for(i=0;i<10;i++)
        if(a[i]==search)
        {
            flag=1;
            break;
        }
        if(flag==0)
            System.out.println("\nSearch element not present");
        else
            System.out.println("\nSearch element present");
            
        
    }
}
