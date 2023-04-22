package Practice3;

public class amsrng {
	static int fact(int rem) {
		int fact=1;
		for(int i=rem;i>=1;i--) {
			fact=fact*i;
		}
			return fact;
	}
public static void main(String[] args) {
	int no=153;
	int sum=0;
	int copy=no;
	while (no!=0) {
		int rem=no%10;
		sum=sum+(rem*rem*rem);
		no=no/10;
	}
	if (sum==copy) {
		System.out.println("amstrng");
}
	else {
		System.out.println("not amstrng");
	}
}
}