package Tasks1;

public class Reversestring {
	public static void main(String[] args) {
String s1="java";
String s2="";
for(int i=s1.length()-1;i>=0;i--) {
	s2=s1+s2.charAt(i);
}
System.out.println(s2);
}
}
