package Tasks;
class Jallalsir{
	void java() {
		System.out.println("javajava");
	}
}
public class Passbyref {
public static void main(String[] args) {
	Jallalsir j1=new Jallalsir();
	Star.prgm(j1);
	Serious.prgm(j1);
}
}
class Star{
	static void prgm(Jallalsir j2) {
		j2.java();
	}
}
class Serious{
	static void prgm(Jallalsir j3) {
		j3.java();
	}
}