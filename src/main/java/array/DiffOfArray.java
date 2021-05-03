package array;

import java.util.Scanner;
import java.util.Stack;

public class DiffOfArray {
	

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int[] arr1=new int[n1];
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		
		int n2=sc.nextInt();
		int[] arr2=new int[n2];
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		
		Stack<Integer>stack=new Stack<>();
		int max=Math.max(n1, n2);
		int carry=0;
		int diff=0;
		n1--;
		n2--;
		for(int i=max-1;i>=0;i--) {
			
			diff+=carry;
			
			if(n2>=0) {
				diff+=arr2[n2];
				n2--;
			}
			
			if(n1>=0) {
				diff-=arr1[n1];
				n1--;
			}
			
			if(diff<0) {
				carry=-1;
				diff=10+diff;
			}
			else {
				carry=0;
			}
			stack.push(diff);
			diff=0;
		}
		int i=0;
		while(!stack.isEmpty()) {
			Integer s=stack.pop();
			if(i==0&&s==0) {
				
			}
			else {
				i++;
				System.out.println(s);
			}
		}
	 }
//	2
//	1
//	2
//	4
//	3
//	4
//	2
//	0

}
