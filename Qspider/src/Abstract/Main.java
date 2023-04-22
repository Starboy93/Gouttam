package Abstract;

abstract class Demo {
	abstract void disp();
	abstract void mo();
}
 abstract class Sample extends Demo{
	void disp() {
		System.out.println("fofo");
	}
}
 class Memo extends Sample {
	 void mo() {
		 System.out.println("momo"); 
	 }
 }
public class Main{
	public static void main(String[] args) {
		 Memo m1=new Memo();
		m1.disp();
		m1.mo();
	}
}
