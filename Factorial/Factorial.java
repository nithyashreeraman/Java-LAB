import java.util.Scanner;

public class Factorial {
    public static void main(String arg[]){
        Scanner scan= new Scanner(System.in);
        int fact=1;
        int  i,n;
        System.out.println("Enter");
        n=scan.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial= " + fact);
    }
}
