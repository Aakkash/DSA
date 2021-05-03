package array;

import java.util.Scanner;
import java.util.Stack;

public class SumofArray {
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
		
		Stack<Integer> stack=new Stack<>();
		int max=Math.max(n1, n2);
		int carry=0;
		int sum=0;
		n1--;
		n2--;
		for(int i=max-1;i>=0;i--) {
			sum+=carry;
			if(n1>=0) {
				sum+=arr1[n1];
				n1--;
			}
			
			if(n2>=0) {
				sum+=arr2[n2];
				n2--;
			}
			
			if(sum>9) {
				carry=1;
				sum=sum-10;
			}
			else {
				carry=0;
			}
			stack.push(sum);
			sum=0;
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	 }
}
