package com;

import java.util.Scanner;

public class PrintRepeatingElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Ente the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		repeatingElements(ar);
	}
	public static void repeatingElements(int[] ar) {
		boolean found=false;
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i]==ar[i+1]) {
				found=true;
				System.out.print(ar[i]+" ");
			}
			while(i<ar.length && ar[i]==ar[i+1]) {
				i++;
			}
		}
		if(!found) {
			System.out.println("Not found");
		}
	}

}
