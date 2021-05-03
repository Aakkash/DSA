package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class SubsetsOfArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int x=(int) Math.pow(2, n);
		
		for(int i=0;i<x;i++) {
			int num=getValueInBase(i,2);
			String str="";
			for(int j=n-1;j>=0;j--) {
				int d=num%10;
				num/=10;
				
				if(d>0) {
					str=arr[j]+"\t"+str;
				}
				else {
					str="-\t"+str;
				}
				
			}
			System.out.println(str);
		}
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
