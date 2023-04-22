package Assign;

public class Fact {
public static void main(String[] args) {
	int fib1=0;
	int fib2=1;
	
	System.out.print(fib1+" ");
	System.out.print(fib2+" ");
	for(int i=1;i<=5;i++) {
		int fib3=fib1+fib2;
		System.out.print(fib3+" ");
		fib1=fib2;
		fib2=fib3;
	
	}
}
}
