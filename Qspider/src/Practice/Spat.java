package Practice;
import java.util.*;
public class Spat {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the 1st number");
	int n=s.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
		System.out.print("*");
		}
System.out.println();
}
}
}