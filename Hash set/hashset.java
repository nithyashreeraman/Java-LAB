import java.util.*;
public class hashset {
    public static void main(String arg[]){
        HashSet hs=new HashSet();
        hs.add(10);
        hs.add("VIT");
        hs.add(12.5);
        hs.add('A');
        hs.add("Vellore");
        hs.add(10);hs.add(10);hs.add(10);
        hs.add("10");
        Iterator it1=hs.iterator();
        System.out.println("Elements of HashSet");
        while(it1.hasNext())
            System.out.println(it1.next());
        
    }
}
