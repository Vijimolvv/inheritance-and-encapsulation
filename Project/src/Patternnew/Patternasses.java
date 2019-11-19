package Patternnew;

import java.util.Scanner;

public class Patternasses {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 System.out.println("enter a num");
		 int num=s.nextInt();
		 System.out.println("enter a string");
		 
		// int alphabet = 65;
		 String str=s.nextLine();
		 
	        System.out.println("** Printing the pattern... **");
	        for (int i = 0; i <= num; i++)
	        {
	            for (int j = 0; j <= i; j++)
	            {
	                System.out.print((char) (str.charAt(i) + j) + " ");
	            }
	            System.out.println();
	        }
	}

}
