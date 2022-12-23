import java.util.Scanner;
public class Wrapper {
    public static void main(String arg[]){
        String s[]=new String[20];
        int n,i=0,ar[];
        ar=new int[20];
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the no.of strings");
        n=scan.nextInt();
        while(i<n){
            System.out.println("Enter the strings");
            s[i]=new String();
            s[i]=scan.next();
            ar[i]=Integer.parseInt(s[i++]);
        }
        for(i=0;i<n;i++)
            System.out.println(ar[i] + " ");
        String s1=new String();
        System.out.println("Enter the text:");
                System.out.println(s1);

        
        //something wrong in code
    }
    
}
