package Fiboo1;
class Sample13{
	int fibo()
	{
		int fib1=0;
		int fib2=1;
		int fib3=0;
		System.out.print(fib1+" "+fib2+" ");
		for(int i=1;i<=5;i++) 
		{
			 fib3=fib1+fib2;
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
		
	}	
		return fib3;
	}
}
public class Fibmr {
	public static void main(String[] args) 
	{
		Sample13 s1=new Sample13();
	int x=	s1.fibo();
	//System.out.println(x);
}
}

