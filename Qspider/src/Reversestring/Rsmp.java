package Reversestring;
class Memo2{
	void rev(String s1) {
	String s2="";
	for(int i=s1.length()-1;i>=0;i--) {
		s2=s2+s1.charAt(i);
	}
	System.out.println(s2);
}
}
public class Rsmp {
public static void main(String[] args) {
	Memo2 m1=new Memo2();
	m1.rev("goutam");
}
}
