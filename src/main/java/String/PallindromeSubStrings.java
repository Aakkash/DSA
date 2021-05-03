package String;

import java.util.Scanner;

public class PallindromeSubStrings {
	public static void solution(String str){
		//write your code here
		int n=str.length();
		for(int i=0;i<=n;i++){
		    for(int j=i;j<=n;j++){
		        printIfPallindrome(str.substring(i,j));
		    }
		}
	}
	
	public static void printIfPallindrome(String str){
	    if(!str.equals("") && str.equals(new StringBuilder(str).reverse().toString())){
	        System.out.print(str+"\n");
	    }
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}

