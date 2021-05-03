package array;

import java.util.Scanner;
import java.util.Stack;

public class AnyBaseToDecimal {
	
	 public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      int d = getValueIndecimal(n, b);
	      System.out.println(d);
	   }
	  
	   public static int getValueIndecimal(int n, int b){
		   int i=0;
		   int num=0;
		   while(n>0) {
			   int x=n%10;
			   num+=(int) (Math.pow(b, i)*x);
			   n=n/10;
			   i++;
		   }
		   return num;
	   }

}
