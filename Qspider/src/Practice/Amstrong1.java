package Practice;

public class Amstrong1 {
public static void main(String[] args) {
	int no=103210;
	int count=0;
	while(no!=0) {
		int rem=no%100;
		if(rem==10) {
			count++;
		}
			no=no/100;
		}
	System.out.println(count);
}
}