package com;

import java.util.Scanner;

public class SwappingIndexsInAnArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		
		swappingAdjecentElementUsingIndexes(ar);
		
	}
	public static void swappingAdjecentElementUsingIndexes(int[] ar) {
		
		for(int i=0; i<ar.length-1; i=i+2) {
			int temp=ar[i];
			ar[i]=ar[i+1];
			ar[i+1]=temp;
		}
		
//		After All the functionality,printing.
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
