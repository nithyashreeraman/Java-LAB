import java.util.Scanner;
import java.lang.Exception;

class prime extends Thread {
            public void run()
            {
                int a[]=new int[10];
                String  prime= "";
                Scanner scan=new Scanner(System.in);
        System.out.println("Enter 10 integers ");
        System.out.println();
        for(int i=0;i<10;i++)
            a[i]=scan.nextInt();
        System.out.println("Prime numbers: ");
        for(int i=0;i<10;i++) 
        {

       int temp=0; 
          for(int j=2;j<=a[i]/2;j++) 
           { 
              if(a[i]%j==0) 
              { 
                  temp++; 
                  break; 
              } 
            } 
            if(temp==0) 
            { 
              System.out.print(a[i] + " "); 
            } 
        } 
        

            }
}

 class sum extends Thread 
        {
            public void run() {
              int  sum=0;
                for(int i =1; i<=20;i++){
           sum =sum + i;
                }
       

       System.out.println("Sum of first 20 natural numbers is: "+sum);
       System.out.println();
    }
        }
        
public class thread2 {

   
    public static void main(String args[]) {
        Thread t1 = new prime();
        Thread t2 = new sum();
        t1.start();
        t2.start();
    }
}
