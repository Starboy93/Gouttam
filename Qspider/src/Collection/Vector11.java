package Collection;
import java.util.Vector;
public class Vector11 {
public static void main(String[] args) {
	Vector<Integer> v=new Vector();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	v.add(50);
	v.add(60);
	v.add(70);
	v.add(80);
	v.add(90);
	int x= v.capacity();
	System.out.println(x);
	for(int i=0;i<v.size();i++) {
		System.out.println(v.get(i));
	}
}
}
