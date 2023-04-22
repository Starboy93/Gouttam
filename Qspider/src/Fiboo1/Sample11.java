
package Fiboo1;
public class Sample11 
{
	void fibo(int no)
	{
		int fib1=0;
		int fib2=1;
		System.out.println(fib1+" "+fib2+" ");
		for(int i=1;i<=no;i++) 
		{
			int fib3=fib1+fib2;
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
		}
		}
public class Fibmp
{
	public static void main(String[] args) 
	{
		Sample11 s1=new Sample11();
		s1.fibo(5);
}
}
}