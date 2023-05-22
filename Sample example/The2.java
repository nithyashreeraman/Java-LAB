import java.util.Scanner;
public class The2 {
    public static void main(String arg[]){
        int sum=0;
        int i;
        int a[]=new int[10];
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 3 int");
        for(i=0;i<3;i++)
        {
            a[i]=scan.nextInt();
            sum=sum+a[i];
        }
        
        float avg;
        avg=(float)sum/3;
        System.out.println("The average is " + avg);
    }
}
