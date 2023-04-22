package Reversestring;
class Memo1{
	String rev() {
	String s1="ishu";
	String s2="";
	for(int i=s1.length()-1;i>=0;i--) {
		s2=s2+s1.charAt(i);
	}
	return s2;
}
}
public class Rsmr {
	public static void main(String[] args) {
		Memo4 m1=new Memo4();
		String x=m1.rev();
		System.out.println(x);
}
}
