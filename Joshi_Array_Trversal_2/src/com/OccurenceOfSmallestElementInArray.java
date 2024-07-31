package com;

import java.util.Scanner;

public class OccurenceOfSmallestElementInArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		occurenceOfSmallestElement(ar);
	}
	public static int smallestElement(int[] ar) {
		int small=Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]<small) {
				small=ar[i];
			}
		}
		return small;
	}
	
	public static void occurenceOfSmallestElement(int[] ar) {
		int smallestElement=smallestElement(ar);
		int count=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==smallestElement) {
				count++;
			}
		}
		System.out.println("Occurence of Smallest Element: "+count);
	}

}
