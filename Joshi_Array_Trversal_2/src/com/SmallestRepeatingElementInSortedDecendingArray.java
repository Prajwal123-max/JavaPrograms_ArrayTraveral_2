package com;

import java.util.Scanner;

public class SmallestRepeatingElementInSortedDecendingArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		
		int res=smallestRepeatingElement(ar);
		System.out.println(res);
	}
	public static int smallestRepeatingElement(int[] ar) {
		boolean found=false;
		int min=Integer.MAX_VALUE;
		for(int i=ar.length-1; i>=0; i--) {
			int count=0;
			for(int j=ar.length-1; j>=0; j--) {
				if(ar[i]==ar[j]) {
					count++;
				}
			}
			if(count>1) {
				min=Math.min(min, ar[i]);
				found=true;
			}
		}
		if(found) {
			return min;
		}else {
			return -1;
		}
	}

}
