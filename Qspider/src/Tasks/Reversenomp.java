package Tasks;
class Sample2{
	void num(int no) {
		int rev=0;
		while(no!=0) {
		int rem=no%10;
		rev=(rev*10)+rem;
		no=no/10;
		}
		System.out.println("**");
		System.out.println(rev);
		System.out.println("**");
	}
}
public class Reversenomp {
public static void main(String[] args) {
	Sample2 s1=new Sample2();
	s1.num(123);
}
}


