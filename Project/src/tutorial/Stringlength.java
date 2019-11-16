package tutorial;

import java.util.Scanner;

public class Stringlength {

	public static void main(String[] args) {
		System.out.print("String");
		 Scanner s=new Scanner (System.in);


		  String year=s.nextLine();
		  
		 // String w= Integer.toString(year); 
		  
		  int d=year.length();
		  System.out.print(d);
	}

}
