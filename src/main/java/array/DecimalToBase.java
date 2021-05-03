package array;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBase {
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      int dn = getValueInBase(n, b);
	      System.out.println(dn);
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
