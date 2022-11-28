import java.util.LinkedList;
import java.util.Scanner;
public class LikedList_String {
    LinkedList Insert(LinkedList L,String s){
        L.add(s);
        System.out.println("After invoking Insert() method: "+L);
        return L;
    }
    LinkedList Remove(LinkedList L,String s){
        Object obj;
        if(L.contains(s))
        {
        obj=L.remove(s);
        if(obj.getClass()==Integer.class)
            System.out.print("Integer");
        }
        else
            System.out.println("Data not available in the list...");
        System.out.println("After invoking Remove method: "+L);
        return L;
    }
     public static void main(String args[]){
     LinkedList<String> ll=new LinkedList();
     Scanner scan=new Scanner(System.in);
     LikedList_String obj=new LikedList_String();
     int ch;
     String str;
     do{
         System.out.print("1.Insert String\n2.Remove String\n3.Exit\nEnter ur choice:");
         ch=scan.nextInt();
         switch(ch){
             case 1:System.out.print("Enter the string:");
                    str=scan.next();
                    ll=obj.Insert(ll,str);
                    break;
             case 2:System.out.print("Enter the string:");
                    str=scan.next();
                    ll=obj.Remove(ll, str);
                    break;
             case 3:break;
             default:System.out.println("Invalid choice....");
         }
     }while(ch!=3);
     }
   }