package different.access;

import java.util.Scanner;

public class Class1 {
public static void main(String[] args) {
	int a;
	try {
		System.out.println("Entre a Int number");
		Scanner rishi= new Scanner(System.in); // created instence sc
		a=rishi.nextInt();
		System.out.println("Entered Number is "+a);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Please enter numbre Only ");
		Scanner rishi= new Scanner(System.in);
		a=rishi.nextInt();
		System.out.println("Entered Number is "+a);
	}
	public void a{};
}
}
