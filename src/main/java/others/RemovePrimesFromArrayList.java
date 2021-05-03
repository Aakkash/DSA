package others;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimesFromArrayList {
	public static void solution(ArrayList<Integer> al){
		
		for(int i=al.size()-1;i>=0;i--) {
			if(isPrime(al.get(i))) {
				al.remove(i);
			}
		}
	}
	private static boolean isPrime(Integer integer) {
		for(int i=2;i*i<=integer;i++) {
			if(integer%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}
}
