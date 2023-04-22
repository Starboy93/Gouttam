package Collection;
import java.util.ArrayList;
public class Retain {
	public static void main(String[] args) {
		ArrayList l1= new ArrayList();
		l1.add("hey");
		l1.add(123);
		l1.add('a');
		l1.add(12.5);
		l1.add(null);
		l1.add(123);
		l1.add(true);
		System.out.println("before"+l1);
		ArrayList l2= new ArrayList();
		l2.add(123);
		l2.add("heyy");
		l2.add(12.5);
		l2.add('r');
		l2.add(12.5);
	     l2.add(true);
	     l1.removeAll(l2);
	     System.out.println("after"+l1);
	}
	}

