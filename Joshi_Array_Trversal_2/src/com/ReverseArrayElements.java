package com;

import java.util.Scanner;

public class ReverseArrayElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		
		reverseArrayElements(ar);
	}
	public static void reverseArrayElements(int[] ar) {
		for(int i=ar.length-1; i>=0; i--) {
			System.out.print(ar[i]+" ");
		}
	}

}
