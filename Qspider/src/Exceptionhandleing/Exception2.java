package Exceptionhandleing;

public class Exception2 {
	public static void main(String[] args) {
		System.out.println("sankhanil");
	
		try {
			int i=12/3;
			int[]arr= {60,80,40,65,33};
			System.out.println(arr[i]);
	}
		catch(ArithmeticException e) {
			System.out.println("handleing");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught");
	}
		System.out.println("in morning");
	}
}
