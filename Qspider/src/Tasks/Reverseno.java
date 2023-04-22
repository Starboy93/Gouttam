package Tasks;
class Demo3{
	void num() {
		int no=123;
		int rev=0;
		while(no!=0) {
		int rem=no%10;
		rev=(rev*10)+rem;
		no=no/10;
		}
		System.out.println(rev);
	}
}
public class Reverseno {
	
public static void main(String[] args) {
	Demo3 r1=new Demo3();
	r1.num();
	
}
}
