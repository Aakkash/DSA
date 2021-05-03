package leetcode.most.water.container;

class Solution {

	public static void main(String[] args) {
		int[] arr = {1,3,2,5,25,24,5};

		System.out.println(maxArea(arr));
	}

	public static int maxArea(int[] h) {
		int n = h.length;
		int max = -1;
		int j = n - 1;
		int i = 0;
		while (j > i) {
			int area = (Math.min(h[i], h[j])) * (Math.abs(i - j));
			if (area > max) {
				max = area;
			}
			int tempNo = h[i];
			int k = i+1;
			for (; k <= j; k++) {
				if (h[k] > tempNo) {
					break;
				}
			}
//			i = k;
			tempNo = h[j];
			int l = j-1;
			for (; l >= i; l--) {
				if (h[l] > tempNo) {
					break;
				}
			}
//			j = l;
			
			if(k>=n||l<=0) {
				break;
			}
			

			if((Math.min(h[k], h[j])) * (Math.abs(k - j))>max) {
				i=k;
				max=(Math.min(h[k], h[j])) * (Math.abs(k - j));
			}
			if((Math.min(h[i], h[l])) * (Math.abs(i - l))>max){
					j=l;
					max=(Math.min(h[i], h[l])) * (Math.abs(i - l));
			}
			
			if((Math.min(h[k], h[l])) * (Math.abs(k - l))>max) {
				i=k;
				j=l;
				max=Math.min(h[k], h[l]) * (Math.abs(k - l));
			}
			
			
		}
		return max;
	}
}