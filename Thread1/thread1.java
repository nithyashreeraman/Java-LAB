import java.util.Scanner;
import java.lang.Exception;

class palindrome extends Thread {
            public void run()
            {
               String s,s1="";
         int l;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String for palindrome ");
        System.out.println();
        s=scan.next();
        l = s.length();   
      for (int i =l- 1;i >= 0;i--)  
         s1 =s1+ s.charAt(i); 
        if(s.equals(s1))
        {
             System.out.println();
            System.out.println(s+ " is a palindrome");
        
        }
        else
        {
            System.out.println();
             System.out.println(s+ " is not a palindrome");
            }
            }
}

 class sub extends Thread 
        {
            public void run() {
                String str;
                int len;
                Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String for substring");
        System.out.println();
        str=scan.next();
        len=str.length();
        
        if(len%2==0)
        {
            int n= (len-4)/2;
             System.out.println();
                System.out.println(str.substring(n, n+4));
            
        }
        else{
             int n= (len-3)/2;
             System.out.println();
                System.out.println(str.substring(n, n+3));
            
        }
            }
        }
public class thread1 {

    
    public static void main(String args[]) {
       
        Thread t1 = new palindrome();
        Thread t2 = new sub();
        t1.start();
        t2.start();
    }
}
