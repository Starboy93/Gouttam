package Reversestring;
class Demo7
{
	String copy;
	String rev()
	{
	String s1="tot";
	copy=s1;
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
	}
	return s2;
	}
}
	

public class Palinmr 
{
	public static void main(String[] args) 
	{
		Demo7 d1=new Demo7();
		String y=d1.rev();
		String s=d1.copy;
		
		System.out.println(y);
		if(y.equals(s)) {
	System.out.println("palin");
}
else {
	System.out.println("not palin");
}
}
}