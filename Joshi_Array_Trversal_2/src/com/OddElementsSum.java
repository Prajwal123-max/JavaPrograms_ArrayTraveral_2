package com;

import java.util.Scanner;

public class OddElementsSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		
		oddElementsSum(ar);
	}
	public static void oddElementsSum(int[] ar) {
		int sum=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2!=0) {
				sum=sum+ar[i];
			}
		}
		System.out.println(sum);
	}

}
