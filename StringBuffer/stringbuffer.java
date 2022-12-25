import java.util.Scanner;
public class stringbuffer {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        String s1=new String();
        System.out.println("Enter the String");
        s1=scan.next();
        /*
        char c,str[];
        c=s1.charAt(0);
        str=new char[20];
        System.out.println("Element at index at 0: " + c);
        s1.getChars(2,5,str, 0);
        System.out.println(str);
        System.out.println("Enter the prefix");
        String pre=new String();
        pre=scan.next();
        if(s1.startsWith(pre))
            System.out.println("Yes, string starts with " + pre);
        else
            System.out.println("No, string does not starts with " + pre);
*/
          String check;
                check=new String();
        System.out.println("Enter another string");
        check=scan.next();

        int flag;
        flag= s1.compareTo(check);
        System.out.println("Flag=" + flag);
        

    }
}
