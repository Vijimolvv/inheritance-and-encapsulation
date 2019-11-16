package tutorial;

import java.util.Scanner;

public class Stringlen {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
	        System.out.println("enter the string");
	       String vv=s.nextLine();
		
		//String blah = "HellO";
		int count = 0;
		for (char c : vv.toCharArray()) {
		    count++;
		}
		System.out.println("string length: " + count);
		
		

	}

}
