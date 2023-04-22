package Tasks;

public class Methodoverns {
	 void send(int x) {
		System.out.println("hi");
	}
	 void send(String y) {
		System.out.println("hey");
	}
	 void send( int x,String y) {
		System.out.println("hhhey");
	}
	 void send(String y, int x) {
		System.out.println("byyyeeee");
}
	 public static void main(String[] args) {
		new Methodoverns().send(3);
		new Methodoverns().send("i");
		new Methodoverns().send(3,"love");
		new Methodoverns().send("u",3);
	}
}
	 
	 
