package com.firstPackage;

import java.util.Scanner;

public class ScannerClass {
	
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	System.out.println("Enter Inp  ut Number");
	int input= sc.nextInt();
	System.out.println("Entered Input Number is ="+input);
	sc.close();
}
}
