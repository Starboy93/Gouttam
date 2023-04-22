package Factorial1;

public class Factsmr {
	static int factorial() {
		int fact=1;
		for(int i=5;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
	int x= factorial();
	System.out.println(x);
}
}
