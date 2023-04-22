package Assign;

public class Prime {
public static void main(String[] args) {
	int no=5;
	boolean f=true;
	for(int i=2;i<no;i++) {
		if(no%i==0) {
			f=false;
			break;}
			
		}
	if (f == true)
	{
		System.out.println("PRIME");
	}
	else
	{
		System.out.println("NOT PRIME");
	}
}
}
