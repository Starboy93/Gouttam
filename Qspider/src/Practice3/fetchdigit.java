package Practice3;

public class fetchdigit {
	public static void main(String[] args) {
		String s1="ghGFjfkh56  00))";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isAlphabetic(s1.charAt(i))) {
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
