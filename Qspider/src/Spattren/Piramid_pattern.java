package Spattren;

public class Piramid_pattern {
	public static void main(String[] args) {
		int space=3;
		int star =1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=space;j++) {
			System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print(" *");
			}
			System.out.println();
			space--;
			star++;
		}
		int space1=1;
		int star1=3;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=space1;j++) {
			System.out.print(" ");
			}
			for(int k=1;k<=star1;k++) {
				System.out.print(" *");
			}
			System.out.println();
			space1++;
			star1--;
	}
}
}