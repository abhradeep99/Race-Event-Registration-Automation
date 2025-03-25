package com.firstPackage;

import java.util.Scanner;

public class SwapNumbers {
 public static void main(String[] args) {
	  int a=10,b=20;
	  System.out.println("Number Before Swap is A="+a+" B is ="+b);

	//1st method using 3rd variables   
//	  int temp;
//	  temp =a;
//	  a=b; 
//	  b=temp;
//	  System.out.println("Number After Swap is A="+a+" B is ="+b);
	  // Addition Subtraction 
//	a=a+b;
//	b=a-b;
//	a=a-b;
//	  System.out.println("Number After Swap is A="+a+" B is ="+b);
//	 //Division Multiplication
//	  a=a*b;
//	  b=a/b;
//	  a=a/b;
//	  System.out.println("Number After Swap is A="+a  +" B is ="+b);
	  //Using Xor Gate
//	a=a^b;  
//	b=a^b;
//	a=a^b;
//	  System.out.println("Number After Swap is A="+a+" B is ="+b);  
	 //Using Single Line Instruction
	  b=a+b-(a=b);
	  System.out.println("Number After Swap is A="+a+" B is ="+b);  
	  
	  
	  
	  
	
	  
	  
}
}
