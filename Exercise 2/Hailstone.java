import java.util.Scanner;
public class Hailstone {
    public static void main(String arg[]){
        int n;
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter a number");
    n=scan.nextInt();
    System.out.println("Hailstone sequence");
    System.out.print(n + " ");
    while(n!=1)
    {
    if(n%2==0)
    {
        n=n/2;
        System.out.print(n + " ");
        
    }
    else
    {
        n=3*n + 1;
        System.out.print(n + " ");
    }
    }
    }
    
}
