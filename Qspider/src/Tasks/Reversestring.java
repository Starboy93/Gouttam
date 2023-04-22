package Tasks;
class Memo3{
	void rev() {
		String s1="java";
		String s2="";
		for(int i=s1.length(); i<=0; i++)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
}
}
public class Reversestring {
public static void main(String[] args) {
	Memo3 m3=new Memo3();
	m3.rev();
}
}
