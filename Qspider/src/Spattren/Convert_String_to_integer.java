package Spattren;

public class Convert_String_to_integer {

	public static void main(String[] args) {
		String s1="143GSM431";
		//012345678
		String s2=s1.substring(0,3);
		String s3=s1.substring(6);
	int x = Integer.parseInt(s2)+Integer.parseInt(s3);
	System.out.println(x);
		}
	}


