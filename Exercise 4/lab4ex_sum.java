import java.util.Scanner;         //error
class sum{
    public int a;

public void read(int n)
    {
       a=n;
    }
public int sum(sum n)
 {
        int ss=0;
        int i=1;
     while(i<=a)
        {
            ss += i;
            i++;
        }
     return ss;
 }
}
public class lab4ex_sum {
    public static void main(String arg[]){
        int n;
        Scanner scan=new Scanner(System.in);
        sum s;
        s=new sum();
        System.out.println("Enter an int");
        n=scan.nextInt();
        System.out.println("Sum = ");
        s.read(n);

    }

            
}
