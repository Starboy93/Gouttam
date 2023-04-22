package Returnpalindrom;
class Demo7
{
	String rev()
	{
	String s1="tot";
	String copy=s1;
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
	}
	return s2;
	}
	
	}
	
   
public class Returnpalindrom {
	public static void main(String[] args) 
	{
		Demo7 d1=new Demo7();
		String y=d1.rev();
		System.out.println(y);
}
}

