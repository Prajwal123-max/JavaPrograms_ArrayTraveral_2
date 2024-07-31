package com;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		secondLargestElement(ar);
	}
	public static void secondLargestElement(int[] ar) {
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max) {
				secondMax=max;
				max=ar[i];
			}
			else if(ar[i]>secondMax && ar[i]!=max) {
				secondMax=ar[i];
			}
		}
		System.out.println(secondMax);
	}

}
