package tutorial;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
	double cir=n*2*3.14;
		System.out.printf(" Circumference of the circle is %.2f",cir);

	}

}
