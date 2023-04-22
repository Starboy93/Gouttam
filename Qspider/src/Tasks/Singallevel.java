package Tasks;
class Sample{
	int x=10;
}
class Demo extends Sample{
	void fo() {
		System.out.println("popo");
	}
}
public class Singallevel {
public static void main(String[] args) {
	Demo d1= new Demo();
	d1.fo();
	System.out.println(d1.x);
}
}
