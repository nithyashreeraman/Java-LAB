import java.util.Iterator;
import java.util.TreeSet;


class sample1{
    int a;
    public sample1(int a){
                this.a=a;
    }
@Override
public String toString()
{return "Hi";}
}
public class treeset {
    public static void main(String arg[]){
        TreeSet<String> ts=new TreeSet();
        ts.add("aaa");
        ts.add("ccc");
        ts.add("ddd");
        ts.add("bbb");
        //ts.add(Float.valueOf("15.5"));
        ts.add("SCOPE");
        System.out.println("Iterator...");
        Iterator it=ts.iterator();
        System.out.println("Elements of TreeSet1");
        while(it.hasNext())
            System.out.print(it.next()+" ");
       
        sample1 s1=new sample1(10);
        sample1 s2=new sample1(20);
        TreeSet<sample1> treeset=new TreeSet<>();
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println("Elements of TreeSet2");
        treeset.add(s1);
        treeset.add(s2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        Iterator it1=treeset.iterator();
        //System.out.println("Elements of TreeSet3");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        while(it1.hasNext()){
            sample1 s = new sample1(0);
            s=(sample1)it1.next();
            System.out.println(s.a);
        }
       
        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(Integer.valueOf("10"));
        ts2.add(Integer.valueOf("20"));
        Iterator it2=ts2.iterator();
        System.out.println("Elements of TreeSet2");
        while(it2.hasNext())
            System.out.println(it2.next());
    }
}
 