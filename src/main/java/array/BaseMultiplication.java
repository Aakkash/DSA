package array;

import java.util.Scanner;
import java.util.Stack;

public class BaseMultiplication {
	
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int b = scn.nextInt();
	      int n1 = scn.nextInt();
	      int n2 = scn.nextInt();
	  
	      int d = getMult(b, n1, n2);
	      System.out.println(d);
	   }
	  
	   public static int getMult(int b, int n1, int n2){
		   int numD=getValueInDecimal(n2, b)*getValueInDecimal(n1, b);
		   return getValueInBase(numD, b);
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
