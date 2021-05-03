package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RotateArray {

	public static void display(int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int val : a) {
			sb.append(val + " ");
		}
		System.out.println(sb);
	}

	public static void rotate(int[] a, int k) {
		int n = a.length;
		k=k%n;
		if(k<0){
		    k+=n;
		}
		int[] startTemp = Arrays.copyOfRange(a, 0, n-k);
		int[] endTemp = Arrays.copyOfRange(a, n-k, n);

		for (int i = k,c=0; i < n; i++,c++) {
			a[i]=startTemp[c];
		}
		
		for (int i = 0, c = 0; i < k; i++, c++) {
			a[i] = endTemp[c];
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		int k = Integer.parseInt(br.readLine());
		
		rotate(a, k);
		display(a);
	}

}
