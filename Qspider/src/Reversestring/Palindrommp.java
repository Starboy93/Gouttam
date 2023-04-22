package Reversestring;
class Demo6{
	void rev(String s1) {
	String copy=s1;
	String s2="";
	for(int i=s1.length()-1;i>=0;i--) {
		s2=s2+s1.charAt(i);
	}
	System.out.println(s2);
	if(s2.equals(copy))
	{
		System.out.println("palindrom");
	}
	else {
		System.out.println("not palindrom");
	}
}
}
public class Palindrommp {
	public static void main(String[] args) {
		Demo6 d1=new Demo6();
		d1.rev("nitin");
}
}