package Collection;
import java.util.ArrayList;
public class Co2 {	
	public static void main(String[] args) {
		ArrayList l1= new ArrayList();
		l1.add("hey");
		l1.add(123);
		l1.add('a');
		l1.add(true);
		l1.add(12.5);
		l1.add(null);
		System.out.println("before"+l1);
		ArrayList l2=new ArrayList();
		l2.add("bye");
		l2.add(321);
		l2.add('b');
		l2.add(false);
		l2.add(12.8);
		l2.add(null);

System.out.println("before"+l2);
l1.addAll(3,l2);
System.out.println("after"+l1);
}
}