package Stringfunctions;

public class Sub_string {

	public static void main(String[] args) {
		String s1="java reverse";
		String s2=s1.substring(0, 5);
		String s3 = s2.substring(6);
		String s4 = s3.concat(s2);
		System.out.println(s4);
	}

}
