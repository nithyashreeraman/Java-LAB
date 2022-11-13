import java.util.Scanner;
public class qn2 {
     public static void main(String arg[]){
           String s;
       
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        s=scan.next();
        int index=s.indexOf("AA");
        System.out.println(index);
     }
}
