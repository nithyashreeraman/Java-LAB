import java.util.ArrayList;
import java.util.Iterator;
public class SimpleCollections {
	public static void main(String[] args) {
		ArrayList c;
		c = new ArrayList();		
                System.out.println(c.getClass().getName());
		for (int i=1; i <= 10; i++) { 
			c.add(i + " * " + i + " = "+i*i);
		}
		Iterator iter = c.iterator();
                System.out.println(iter.getClass().getName());
		while (iter.hasNext())
			System.out.println(iter.next());
	}}
