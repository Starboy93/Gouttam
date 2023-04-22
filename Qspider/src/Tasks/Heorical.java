package Tasks;
class Sample1{
	int x=10;
}
class Demo1 extends Sample1{
	void fo() {
		System.out.println("popo");
	}
}
class Memo extends Demo1{
	void to() {
		System.out.println("fofo");
	}
}
public class Heorical {
public static void main(String[] args) {
	Memo m1=new Memo();
	m1.to();
	System.out.println(m1.x);
Demo1 d1=new Demo1();
d1.fo();
System.out.println(d1.x);
}
}
