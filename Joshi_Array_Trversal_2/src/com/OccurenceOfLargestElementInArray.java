package com;

import java.util.Scanner;

public class OccurenceOfLargestElementInArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		
		occurenceOfLargestElement(ar);
		
	}
	public static int largestElement(int[] ar) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		return max;
	}
	public static void occurenceOfLargestElement(int[] ar) {
		int largestElement=largestElement(ar);
		int count=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==largestElement) {
				count++;
			}
		}
		System.out.println("Occurence of Largest Element in an Array: "+count);
	}

}
