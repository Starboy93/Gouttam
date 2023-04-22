package Stringfunctions;

import java.util.Scanner;

public class Reverse_index 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	String no = sc.nextLine();
	String[] arr = no.split(" ");
	for(int i=0;i<arr.length;i++) {
		System.out.print(rev(arr[i])+"");
	}
}
public static String rev( String s) {
	String s1=" i am star boy";
	String s2=" ";
	for(int i=s.length()-1;i>=0;i--) {
		s2=s2+s.charAt(i);
	}
	return s2;
	
}

}
