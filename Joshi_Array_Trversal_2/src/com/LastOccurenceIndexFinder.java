package com;

import java.util.Scanner;

public class LastOccurenceIndexFinder {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		System.out.print("Enter the which Element You want to find : ");
		int k=s.nextInt();
		
		lastOccurenceOfindexFinder(ar,k);
	}
	public static void lastOccurenceOfindexFinder(int[] ar,int k) {
		int index=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==k) {
				index=i;
			}
		}
		System.out.println(index);
	}
}
