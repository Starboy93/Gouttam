package Tasks;
class Jallalsir1{
	void java() {
		System.out.println(7);
	}
	}
public class Passbyvalue {
	public static void main(String[] args) {
		
	
	Jallalsir1 n1=new Jallalsir1();
	Star1.num(n1);
	Serious1.num(n1);
}
}
class Star1{
	static void num(Jallalsir1 j2) {
		j2.java();
	}
}
class Serious1{
	static void num(Jallalsir1 j3) {
		j3.java();
	}
}