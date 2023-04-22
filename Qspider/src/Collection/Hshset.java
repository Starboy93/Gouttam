package Collection;
import java.util.HashSet;
public class Hshset {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(123);
	h.add(123);
	h.add("goutam");
	h.add(true);
	h.add('g');
	h.add(null);
	System.out.println(h);
}
}
