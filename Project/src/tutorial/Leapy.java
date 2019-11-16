package tutorial;

import java.util.Scanner;

public class Leapy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
        System.out.print("Enter the year");
     int n = s.nextInt();
     if(n%4==0)
     {
    	 System.out.print("leap year");
     }
     else if(n%100==0||n%400==0)
     {
    	 System.out.print("leap year");
     }
     else
     {
    	 System.out.print("Ordinary year");
     }
    	 
    	 
		
		
	}

}
