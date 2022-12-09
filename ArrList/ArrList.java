import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;
public class ArrList {
public static void main(String[] args) {
//Collection c;
//List c;
ArrayList c;
c = new ArrayList();
System.out.println(c.getClass().getName());
for (int i=1; i <= 10; i++) {
c.add(i + " * " + i + " = "+i*i);
}
c.add(Float.valueOf("91.5"));
c.add("vit");
c.add(3,"ANURADHA");
c.add(Float.valueOf("93.9"));
c.add("vit");
c.add(Integer.valueOf("10"));
c.add(Integer.valueOf("10"));
c.add(100);
c.add(Integer.valueOf(100));
Iterator iter = c.iterator();
System.out.println("The ArrayList elements are....");
while (iter.hasNext())
System.out.println(iter.next());
}
}