package Tasks;

public class Methodoverloading {
static void send(int x) {
	System.out.println("hi");
}
static void send(String y) {
	System.out.println("hey");
}
static void send( int x,String y) {
	System.out.println("hhhey");
}
static void send(String y, int x) {
	System.out.println("byyyeeee");
}
public static void main(String[] args) {
	send(2);
	send("janu");
	send(2,"i love");
	send("u",2);
}
}

