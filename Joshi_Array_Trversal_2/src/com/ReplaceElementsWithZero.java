package com;

import java.util.Scanner;

public class ReplaceElementsWithZero {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		
		replaceEvenElementsWithZero(ar);
	}
	public static void replaceEvenElementsWithZero(int[] ar) {
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==0) {
				ar[i]=0;
			}
		}
		
//		printing result Array after replacing.
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
