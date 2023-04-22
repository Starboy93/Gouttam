package Practice3;

public class Strong1 {
	public static void main(String[] args) {
int no=2;
int copy=no;
int sum=0;
while(no!=0) {
	int rem=no%10;
	int fact=1;

	for(int i=rem;i>0;i--) {
		fact=fact*i;
	}
		sum=sum+fact;
		no=no/10;
	}

	if(sum==copy) {
		System.out.println(sum+" strong");
	}
	else {
		System.out.println(sum+" not strong");
	}

}
	}
