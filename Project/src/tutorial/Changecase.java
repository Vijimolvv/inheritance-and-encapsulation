package tutorial;

import java.util.Scanner;

public class Changecase {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		 System.out.print("Enter the Character");
		String a =s.next();
		char c = a.charAt(0);
		  if(c>65&&c<90) 
		  {
			  
			
			String abc= a.toLowerCase();
			  System.out.println(abc);
		  }
		if(c>97&&c<122) 
		 {
		  String abc= a.toUpperCase();
		  System.out.println(abc);
		 }

	}

}
