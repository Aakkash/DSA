package String;

import java.util.Scanner;

public class CompressedString {

	public static String compression1(String str){
		// write your code here
		String out=String.valueOf(str.charAt(0));
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt(i-1)) {
				out+=str.charAt(i);
			}
		}
		return out;
	}

	public static String compression2(String str){
		
		String out=String.valueOf(str.charAt(0));
		int c=0;
		for(int i=1;i<str.length();i++) {
			c++;
			if(str.charAt(i)!=str.charAt(i-1)) {
				if(c>1) {
					out+=c;
				}
				out+=str.charAt(i);
				c=0;
			}
		}
		if(c>0) {
			out+=c+1;
		}
		return out;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}
}
