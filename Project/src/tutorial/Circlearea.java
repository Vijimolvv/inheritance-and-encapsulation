package tutorial;

import java.util.Scanner;

public class Circlearea {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the radius");
		int r=s.nextInt();
	double cirarea=r*3.14*r;
		System.out.printf(" Circumference of the circle is %.2f",cirarea);
	}

}
