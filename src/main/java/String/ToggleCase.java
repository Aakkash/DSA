package String;

import java.util.Scanner;

public class ToggleCase {
	
	public static String toggleCase(String str){
		String s="";
		for(int i=0;i<str.length();i++) {
			s+=Character.isUpperCase(str.charAt(i))?Character.toLowerCase(str.charAt(i)):Character.toUpperCase(str.charAt(i));
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
