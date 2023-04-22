package Collection;
import java.util.TreeSet;
public class Trset {
public static void main(String[] args) {
	int[]arr= {1,5,4,5,2};
	TreeSet t=new TreeSet();
	for(int i=0;i<arr.length;i++) {
		t.add(arr[i]);
	}
	System.out.println(t);
}
}
