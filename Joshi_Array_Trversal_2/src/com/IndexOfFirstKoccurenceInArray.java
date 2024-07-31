package com;

import java.util.Scanner;

public class IndexOfFirstKoccurenceInArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		System.out.print("Enter the Element you want to find: ");
		int k=s.nextInt();
		
		firstOccurence(ar, k);
	}
	public static void firstOccurence(int[] ar,int k) {
		int index=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==k) {
				index=i;
				break;
			}
		}
		System.out.println(index);
	}

}
