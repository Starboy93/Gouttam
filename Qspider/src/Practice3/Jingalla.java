package Practice3;

public class Jingalla {
public static void main(String[] args) {
	String s1="jkh d-jgu7#73&j53 s1.charAt(i7r";
	String spclcount="";
	for(int i=0;i<s1.length();i++)
	{
		if(!Character.isAlphabetic(s1.charAt(i))&&!Character.isDigit(s1.charAt(i)))
		{
			spclcount=spclcount+s1.charAt(i);
     	}
		
	}
	System.out.println(spclcount);
	}
}
