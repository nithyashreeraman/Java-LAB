import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Comparator;
public class hashmap {
    public static void main(String[] args) {
    HashMap map=new HashMap();
    //Adding elements to map
    map.put(1,"Amit");
    map.put(5,"Rahul");
    map.put(2,"Jai");
    map.put(6,"Amit");
    map.put(7,"Arun");
    map.put(7,"Banu");
    //Traversing Map
    Set set=map.entrySet();//Converting to Set so that we can traverse
    Iterator itr=set.iterator();
    while(itr.hasNext()){
        //Converting to Map.Entry so that we can get key and value separately
        Map.Entry entry=(Map.Entry)itr.next();
        System.out.println(entry.getKey()+" "+entry.getValue());
    }
    //comparingByValue() in Descending Order
    Map<Integer,String> map1=new HashMap();         
      map1.put(100,"Amit");   
      map1.put(101,"Vijay");   
      map1.put(102,"Rahul");   
     //Returns a Set view of the mappings contained in this map   
     map1.entrySet()
     //Returns a sequential Stream with this collection as its source
     .stream()
     //Sorted according to the provided Comparator
     .sorted(Map.Entry.comparingByKey((Comparator.naturalOrder())))
     //Performs an action for each element of this stream
     .forEach(System.out::println);
     map1.entrySet().stream().sorted(Map.Entry.comparingByKey((Comparator.reverseOrder()))).forEach(System.out::println);

    }}
