package com;

import java.util.Scanner;

public class MinimumPairSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		
		minimumPairSum(ar);
	}
	public static void minimumPairSum(int[] ar) {
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]<min) {
				secondMin=min;
				min=ar[i];
			}
			else if(ar[i]<secondMin && ar[i]!=min) {
				secondMin=ar[i];
			}
		}
		int sum=min+secondMin;
		System.out.println("Minimum Pair of sum is ("+min+","+secondMin+")="+sum);
	}

}
