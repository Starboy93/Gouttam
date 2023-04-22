package Space;

public class Char {
	public static void main(String[] args) {
		String s1="143@ BHLSBSGTR# 143";
		int whitespace=0;
		for(int i=0;i<s1.length();i++) {
		if(Character.isWhitespace(s1.charAt(i))){
	whitespace++;
		}
}
System.out.println(whitespace);
}
}
