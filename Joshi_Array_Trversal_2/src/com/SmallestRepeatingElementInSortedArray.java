package com;

import java.util.Scanner;

public class SmallestRepeatingElementInSortedArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		
		int res=smallestRepeatingElement(ar);
		System.out.println(res);
	}
	public static int smallestRepeatingElement(int[] ar) {
		int min=Integer.MAX_VALUE;
		boolean found=false;
		for(int i=0; i<ar.length; i++) {
			int count=0;
			for(int j=0; j<ar.length; j++) {
				if(ar[i]==ar[j]) {
					count++;
				}
			}
			if(count>1) {
				found=true;
				min=Math.min(min, ar[i]);
			}
		}
		if(found) {
			return min;
		}else {
			return -1;
		}
	}

}
