package tutorial;

import java.util.Scanner;

public class Greatestamong3 {

	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
		System.out.println("enter 1st num");
		int n1=s.nextInt();
		System.out.println("enter 2nd num");
		    
		 int   n2=s.nextInt();
		    System.out.println("enter 3rd num");
		   int n3=s.nextInt();
		if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");
        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");
        else
            System.out.println(n3 + " is the largest number.");
		
		

	}

}
