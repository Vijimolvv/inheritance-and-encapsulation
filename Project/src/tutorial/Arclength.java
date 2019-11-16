package tutorial;

import java.util.Scanner;

public class Arclength {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the angle measurement");
		int arc=s.nextInt();
		System.out.println("enter the radius");
		int r=s.nextInt();
		double a=(2*3.14*r);
	double a1=(arc/360);
	double arcl=a*a1;
		System.out.printf(" arc length of the circle is %.2f",arcl);

	}

}
