import java.util.*;
class sample{
@Override
public String toString(){
return "This is an object of Sample";
}
public String display(){
return "Hello";}
}
public class ListExample{
public static void main(String args[]){
int i;
ArrayList al=new ArrayList();
al.add("Amit");
al.add(true);
al.add(10.5);
al.add('S');
al.add(10);
al.add(10.5);
sample s=new sample();
al.add(s);
System.out.println(s.display());
System.out.println("An element at 2nd position: "+al.get(2));
System.out.println("An element at 2nd position: "+al.get(6));
//for(i=0;i<6;i++) System.out.println(al.get(i));
Iterator it=al.iterator();
while(it.hasNext())
System.out.println(it.next());
}
}