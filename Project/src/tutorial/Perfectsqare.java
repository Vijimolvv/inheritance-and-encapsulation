package tutorial;

import java.util.Scanner;

public class Perfectsqare {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int number=s.nextInt();
		 int sqr = (int) Math.sqrt(number);
	        if(sqr*sqr == number) {
	            System.out.println(number+" is a perfect square number");
	        }else {
	            System.out.println(number+" is not a perfect square number");
	        }
	         
		

	}

}
