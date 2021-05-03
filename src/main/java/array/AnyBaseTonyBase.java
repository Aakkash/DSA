package array;

import java.util.Scanner;
import java.util.Stack;

public class AnyBaseTonyBase {
	 public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int sourceBase = scn.nextInt();
	     int  destBase= scn.nextInt();
	     int decimal=getValueInDecimal(n,sourceBase);
	     System.out.println(getValueInBase(decimal,destBase));
	   }  
	  
	   public static int getValueInDecimal(int n, int b){
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
	   
	   public static int getValueInBase(int n, int b){
	       // write code here
	       Stack<Integer> stack=new Stack<>();
	       while(n>0){
	    	   stack.push(n%b);
	           n=n/b;
	       }
	       int i=0;
	       while(!stack.isEmpty()) {
	    	   i=i*10 + stack.pop();
	       }
	       return i;
	   }

}
