package Tasks;
class Sample3{
	int num() {
		int no=123;
		int rev=0;
		while(no!=0) {
		int rem=no%10;
		rev=(rev*10)+rem;
		no=no/10;
		}
		return rev;
		}
}
public class Reversenomr {
	public static void main(String[] args) {
		Sample3 s3=new Sample3();
		int x= s3.num(); 
		System.out.println("**");
		System.out.println(x);
		System.out.println("**");
	}
	}

