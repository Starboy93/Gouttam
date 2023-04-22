package Specialchacterinstring;

public class Number {
	public static void main(String[] args) {
		String s1="java @ # &123";
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if(Character.isDigit(s1.charAt(i))){
				s2=s2+s1.charAt(i);
			}
		}
	System.out.println(s2);
	}
	}

