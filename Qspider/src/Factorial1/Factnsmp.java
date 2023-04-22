package Factorial1;
class Sample14{
	 void factorial(int no){
		int fact=1;
		for(int i=no;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
}
}
public class Factnsmp 
{
	public static void main(String[] args) 
	{
		Sample14 s1=new Sample14();
	s1.factorial(5);
}
}