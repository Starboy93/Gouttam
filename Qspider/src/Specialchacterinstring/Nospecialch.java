package Specialchacterinstring;
public class Nospecialch {
public static void main(String[] args) {
	String s1="java @ # &";
	int spclcount=0;
	for(int i=0;i<s1.length();i++) {
		if(!Character.isAlphabetic(s1.charAt(i))&&!Character.isDigit(s1.charAt(i))){
			spclcount++;
		}
	}
System.out.println(spclcount);
}
}