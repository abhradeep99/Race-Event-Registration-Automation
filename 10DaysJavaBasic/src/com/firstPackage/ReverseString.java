package com.firstPackage;
public class ReverseString {
	private  void usingConcat(String str) {
		// TODO Auto-generated method stub
		String rev="";//not null
		int len=str.length();//4
		for (int i = len-1; i >= 0; i--)//i=3,
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
	}
	// TODO Auto-generated method stub
	private static void usingCharArray(String str) {
	int len=str.length();
		

	} 
public static void main(String[] args) {
	String str="4321";
	ReverseString rc=new ReverseString();
	rc.usingConcat(str);
	usingCharArray(str);
	
}
}
