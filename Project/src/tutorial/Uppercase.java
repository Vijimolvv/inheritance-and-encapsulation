package tutorial;

import java.util.Scanner;

public class Uppercase {

	public static void main(String[] args) {

		 Scanner s=new Scanner (System.in);
		 System.out.print("Enter the String");
		  String sentence=s.nextLine();
		  String abc= sentence.toUpperCase();
	      System.out.println(abc);

	}

}
