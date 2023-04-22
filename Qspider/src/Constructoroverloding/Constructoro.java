package Constructoroverloding;

public class Constructoro {
Constructoro(int x){
System.out.println("hi");
}
Constructoro(String y){
	System.out.println("hey");
}
Constructoro(int x,String y){
	System.out.println("hello");
}
Constructoro(String y, int x){
	System.out.println("buriya");
}
public static void main(String[] args) {
	new Constructoro(10);
	new Constructoro("hee");
	new Constructoro(10,"g");
	new Constructoro("dg",10);
}
}