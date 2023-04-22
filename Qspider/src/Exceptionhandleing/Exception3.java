package Exceptionhandleing;

public class Exception3 {
	public static void main(String[] args) {
		System.out.println("sankhanil");
	
		try {
			int i=10/2;
			int[]arr= {60,80,40,65,33};
			System.out.println(arr[i]);
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("handleing");
		}
		finally {
			System.out.println("close the server");
	}
		System.out.println("in morning");
	}
}

