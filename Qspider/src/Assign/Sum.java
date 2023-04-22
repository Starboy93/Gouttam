package Assign;

public class Sum {
public static void main(String[] args) {
	int no=20152019;
	int sum=0;
	int sum1=0;
	while(no!=0) {
			int rem=no%100;
			if(rem%2==0) {
			sum=sum+rem*rem;
			
		}
		else {
			sum1=sum1+rem;
		}
			
			no=no/100;
		
	}
	System.out.println("SUM="+sum);
	//System.out.println(sum1);
}
}
