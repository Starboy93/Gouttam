package Collection;

import java.util.TreeMap;

public class TrMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(1, "abc");
		t.put(2, "abc");
		t.put(3, "kk");
		System.out.println(t);
	}

}
