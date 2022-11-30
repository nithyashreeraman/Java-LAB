import java.util.*;
public class linkedhashmap {
     public static void main(String args[]){    
       LinkedHashMap<Integer,String> hm=new LinkedHashMap();  
       hm.put(100,"AAAA");  
       hm.put(101,"BBBB");  
       hm.put(103,"DDDD");
       hm.put(102,"CCCC");
       Set set=hm.entrySet();
       Iterator itr=set.iterator();  
       while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value separately  
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }
  }  
 }  
