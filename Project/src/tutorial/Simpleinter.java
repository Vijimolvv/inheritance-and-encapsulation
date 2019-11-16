package tutorial;

import java.util.Scanner;

public class Simpleinter {

	public static void main(String[] args) {

		 Scanner s=new Scanner (System.in);
		 System.out.print("year");
		  int year=s.nextInt();
		  
		  
		  
		  System.out.print("interest rate");
		  int intr=s.nextInt();
		  System.out.print("amount");
		  int amount=s.nextInt();
		  
		  double total=amount+((amount*year*intr)/100);
		  System.out.printf("total amount %.2f ",total);
	}

}
