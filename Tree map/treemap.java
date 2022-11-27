import java.util.*;
public class treemap {
      public static void main(String args[]) {
      TreeMap<Integer,String> map=new TreeMap();   
       map.put(100,"AAAA");
       map.put(101,"BBBB");
       map.put(103,"DDDD");
       map.put(102,"CCCC");  
      System.out.println("Before invoking remove() method");
      Set set=map.entrySet();
      Iterator itr=set.iterator();
      while(itr.hasNext()){
        //Converting to Map.Entry so that we can get key and value separately
        Map.Entry entry=(Map.Entry)itr.next();
        System.out.println(entry.getKey()+" "+entry.getValue());
        }
      map.remove(102);     
      System.out.println("After invoking remove() method");
      set=map.entrySet();
      itr=set.iterator();
      while(itr.hasNext()){
        //Converting to Map.Entry so that we can get key and value separately
        Map.Entry entry=(Map.Entry)itr.next();
        System.out.println(entry.getKey()+" "+entry.getValue());
    }
      }
}
 