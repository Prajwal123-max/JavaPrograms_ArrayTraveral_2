/*
 * finding largest repeating Element in sorted Array.
 */
package com;

import java.util.Scanner;

public class LargestRepeatingElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		int res=largestRepeatingElement(ar);
		System.out.println(res);
	}
	public static int largestRepeatingElement(int[] ar) {
		int max=Integer.MIN_VALUE;
		boolean found=false;
		for(int i=ar.length-1; i>=0; i--) {
			int count=0;
			for(int j=ar.length-1; j>=0; j--) {
				if(ar[i]==ar[j]) {
					count++;
				}
			}
			if(count>1) {
				max=Math.max(max, ar[i]);
				found=true;
			}
		}
		if(found) {
			return max;
		}else {
			return -1;
		}
	}

}
