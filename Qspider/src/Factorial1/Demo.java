package Factorial1;
 class Factm{
	 void factorial() {
			int fact=1;
			for(int i=5;i>=1;i--) {
				fact=fact*i;
			}
			System.out.println(fact);
		}
 }
public class Demo {
	public static void main(String[] args) {
		Factm f1=new Factm();
		f1.factorial();
}
}