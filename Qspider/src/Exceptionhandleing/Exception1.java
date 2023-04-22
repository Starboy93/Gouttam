package Exceptionhandleing;

public class Exception1 {
	public static void main(String[] args) {
		System.out.println("sankhanil");
		int a=5;
		int b=2;
		try {
			int i=a/b;
			int[]arr= {60,80,40,65,33};
			System.out.println(arr[i]);
	}
		catch(ArithmeticException e) {
			System.out.println("handleing");
		}
		System.out.println("in morning");
	}
	}

