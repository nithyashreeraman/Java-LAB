import java.util.Scanner;
public class qn3 {
     public static void main(String arg[]){
         String s,s1="";
         int l;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        s=scan.next();
        l = s.length();   
      for (int i =l- 1;i >= 0;i--)  
         s1 =s1+ s.charAt(i); 
        if(s.equals(s1))
            System.out.println("It is a palindrome");
        else
             System.out.println("It is not a palindrome");
     }
}
