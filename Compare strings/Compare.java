import java.util.Scanner;
public class Compare {
     public void print_hello(){
         Scanner scan=new Scanner(System.in);
          String s1=new String();
        System.out.println("Enter the String");
        s1=scan.next();
        
        String check;
                check=new String();
        System.out.println("Enter another string");
        check=scan.next();

        int flag;
        flag= s1.compareTo(check);
        System.out.println("Flag=" + flag);
     }
}
