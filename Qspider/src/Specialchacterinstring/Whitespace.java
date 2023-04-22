package Specialchacterinstring;

public class Whitespace {
	public static void main(String[] args) {
		String s1="java @ # &";
		int whitespace1=0;
		for(int i=0;i<s1.length();i++) {
			if(Character.isWhitespace(s1.charAt(i))){
				whitespace1++;
			}
		}
	System.out.println(whitespace1);
	}
	}
