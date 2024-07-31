package com;

import java.util.Scanner;

public class MissingElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		int res=missingElement(ar);
		System.out.println(res);
	}
	public static int missingElement(int[] ar) {
		int max=Integer.MIN_VALUE;
//		find maximum element.
		for(int i:ar) {
			if(i>max) {
				max=i;
			}
		}
		
//		create an array size of max+1 Element.
		int[] res=new int[max+1];
		
//		adding 1 to value , index
		for(int i:ar) {
			res[i]=1;
		}
		
//		check which index element has default value 0.
		for(int j=1; j<res.length; j++) {
			if(res[j]==0) {
				return j;
			}
		}
		return -1;
	}

}
