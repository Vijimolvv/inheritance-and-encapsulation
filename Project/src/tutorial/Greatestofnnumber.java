package tutorial;

import java.util.Scanner;

public class Greatestofnnumber {

	public static void main(String[] args) {


		 Scanner s = new Scanner(System.in);
	        int num, i, temp, max;

	        
	        System.out.print("Enter the range:");
	        num = s.nextInt();

	        System.out.println("Enter " + num + " number");
	        // Reading 1st number
	        max = s.nextInt();

	        // Reading other number
	        for (i = 1; i < num; i++)
	        {
	            temp = s.nextInt();
	            if (temp < max)
	                continue;
	            else
	                // largest number
	                max = temp;
	        }

	        System.out.println("Largest Number is " + max);
	    }
	}
		
