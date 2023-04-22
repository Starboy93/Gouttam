package Fiboo1;
class Sample{
	void fibo() {
	int fib1=0;
	int fib2=1;
	System.out.println(fib1+" "+fib2+" ");
	for(int i=1;i<=5;i++) {
		int fib3=fib1+fib2;
		System.out.print(fib3+" ");
		fib1=fib2;
		fib2=fib3;
	}
	}
}
public class Fibm {

public static void main(String[] args) {
	Sample s1=new Sample();
	s1.fibo();
}
}

