package Reversestring;
class Memo8{
	int num() {
		int no =101;
		int copy=no;
		int rev=0;
		while(no!=0) {
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		return rev;
	}
}
	
public class Palinnumm {
public static void main(String[] args) {
	Memo8 m1=new Memo8();
	 int x=m1.num();
	 System.out.println(x);
}
}
