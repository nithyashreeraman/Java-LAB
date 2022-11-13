import java.util.Scanner;
public class ex1 {
    public static void main(String arg[]){
        String s;
       StringBuffer s1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        s=scan.next();
        s1=new StringBuffer(s);
 System.out.println("Enter the String to be inserted and the position");
 String t=scan.next();
 int pos=scan.nextInt();
 s1.insert(pos-1, t);

 System.out.println("The final string is " + s1);  
    }
}
