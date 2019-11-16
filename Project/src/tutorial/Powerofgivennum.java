package tutorial;

import java.util.Scanner;

public class Powerofgivennum {

	public static void main(String[] args) {


		 Scanner s=new Scanner (System.in);
		 System.out.print("Enter the number");
		  int num=s.nextInt();
		  System.out.print("Enter the  power");
		  int powe=s.nextInt();
		  
			 double digit=Math.pow(num,powe);
		  
	
		 
		  
		  System.out.print(digit);

	}

}
