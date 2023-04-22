package Collection;
import java.util.ArrayList;

public class Co1 {
public static void main(String[] args) {
	ArrayList l1= new ArrayList();
	l1.add("hey");
	l1.add(123);
	l1.add('a');
	l1.add(true);
	l1.add(12.5);
	l1.add(null);
	System.out.println("before"+l1);
	l1.add(2,"yo");
	System.out.println("after"+l1);
}
}
