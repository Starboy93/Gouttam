package Practice;

public class Astrong {
public static void main(String[] args) {
	int no=153;
	int sum=0;
	int copy=no;
	while(no!=0) {
		int rem=no%10;
		sum=sum+(rem*rem*rem);
		no=no/10;
	}
	if(sum==copy) {
	System.out.println("amstrong");
	}
	else {
		System.out.println("not amstrong");
	}
}
}
