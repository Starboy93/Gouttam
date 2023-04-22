package Fiboo1;

public class Fibmp1 {
	static void fiboo(int no) {
	int fib1=0;
	int fib2=1;
	System.out.println(fib1+" "+fib2+" ");
	for(int i=1;i<=no;i++) {
		int fib3=fib1+fib2;
		System.out.println(fib3+" ");
		fib1=fib2;
		fib2=fib3;
	}
	}
	public static void main(String[] args) {
	Fibmp1.fiboo(5);	
	}
}
