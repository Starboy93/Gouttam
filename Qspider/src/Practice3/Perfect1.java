package Practice3;

public class Perfect1 {
public static void main(String[] args) {
	int no=2;
	int sum=0;
	for(int i=1;i<no;i++) {
		if(no%i==0) {
			sum=sum+i;
		}
	}
	System.out.println(sum);
	if(sum==no) {
		System.out.println("perfect");
	}
	else {
		System.out.println("not perfect");
	}
}
}
