 package Practice;

public class Strong 
{
static int fact(int rem) 
{
int fact=1;
for(int i=rem;i>=1;i--)
{
	fact=fact*i;
}
return fact;
}
public static void main(String[] args) {
	int no=145;
	int sum=0;
	int copy=no;
	while(no!=0) {
		int rem=no%10;
		sum=sum+fact(rem);
		no=no/10;
	}
		if(copy==sum) {
			System.out.println("strong");
		}
			else {
				System.out.println("not strong");
			}
}
}
