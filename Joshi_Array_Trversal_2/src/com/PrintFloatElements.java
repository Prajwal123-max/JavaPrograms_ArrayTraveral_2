package com;

import java.util.Scanner;

public class PrintFloatElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n=s.nextInt();
		float[] ar=new float[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextFloat();
		}
		printingFloatingElements(ar);
	}
	public static void printingFloatingElements(float[] ar) {
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
