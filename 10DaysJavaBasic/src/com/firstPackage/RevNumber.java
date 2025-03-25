package com.firstPackage;

import java.util.Scanner;

public class RevNumber {
	private static int rev1(int num) {
		// TODO Auto-generated method stub
		System.out.println("Number to be Reverse "+num);
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;	
	}
	private static StringBuilder usingStringBuilder(int num) {		
		// TODO Auto-generated method stub
		System.out.println("Number to be Reverse usingStringBuilder"+num);		
		StringBuilder sb= new StringBuilder(String.valueOf(num));
		StringBuilder rev=sb.reverse();
		return rev;
	}
	private static StringBuffer usingStringBuffer(int num) {
		// TODO Auto-generated method stub
		System.out.println("Number to be Reverse usingStringBuffer "+num);
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev= sb.reverse();
		return rev;						
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre Number to  reverse ");
		int  num =sc.nextInt();		
	//	System.out.println("Reverse Number is = "+rev1(num));
	//	System.out.println("Reverse Number is = "+usingStringBuilder(num));
		System.out.println("Reverse Number is = "+usingStringBuffer(num));
		sc.close();
	}

}
