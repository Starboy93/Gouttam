package Reversestring;
class Demo5{
	void rev() {
	String s1="pop";
	String copy=s1;
	String s2="";
	for(int i=s1.length()-1;i>=0;i--) {
		s2=s2+s1.charAt(i);
	}
	if(s2.equals(copy))
	{
		System.out.println("palindrom");
	}
	else {
		System.out.println("not palindrom");
	}
}
}
public class Ps {
public static void main(String[] args) {
Demo5 d1=new Demo5();
d1.rev();
}
}
