package Factorial1;

public class Factsm {
	static void factorial() {
		int fact=1;
		for(int i=5;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
	factorial();
}
}

