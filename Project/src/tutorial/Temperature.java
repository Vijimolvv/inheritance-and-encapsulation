package tutorial;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the temperature in degree celcious");
	double tem=s.nextDouble();
		double faren=((tem*9)/5+32);
		System.out.printf(" the temperature in Farenheit %.2f ",faren);

	}

}
