package Stringfunctions;

public class Duplicate_string_fetch_unic {
public static void main(String[] args) {
	String[] str= {"hello","hii","hello"};
	for(int i=0;i<str.length;i++) 
	{
		int count=0;
	for(int j=0;j<str.length;j++) {
		if(str[i]==str[j]) {
			count++;
		}
	}
	if(count==1) {
		System.out.println(str[i]);
	}
	}
}
}
