package Factorial1;
class Demo1 {
	 int factorial(int no) {
		int fact=1;
		for(int i=no;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}
}
	
public class Factnsmr {
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		int x= d1.factorial(5);
	System.out.println(x);
}
}