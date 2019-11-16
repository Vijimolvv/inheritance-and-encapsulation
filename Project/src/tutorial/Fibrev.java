package tutorial;

import java.util.Scanner;

public class Fibrev {

	public static void main(String[] args) {
	
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the size");
				Scanner ob = new Scanner(System.in);
				int ch = ob.nextInt();
				//int c=1,d=0;
				//System.out.println("The" + ch + " terms of fibanocci numbers are-");
				int a=1, b=0, s, n;
				//a = b = 1;
				for (n =5; n < ch; n++) {
				
				s = a + b;
				System.out.println(s);
				a = b;
				b = s;
				
				}
				System.out.println(a);
				System.out.println(b);
	}}
		
		
		

