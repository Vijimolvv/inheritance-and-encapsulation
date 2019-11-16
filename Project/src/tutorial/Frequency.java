package tutorial;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {


		 Scanner s = new Scanner(System.in);

	        System.out.print("\nEnter string: ");
	        String s1 = s.nextLine();

	        System.out.print("\nEnter character: ");
	     
	        char c = s.next().charAt(0);

	        int count = 0;

	        char arr[] = s1.toCharArray();

	        for (int i = 0; i < arr.length; i++)
	        {
	            if (arr[i] == c)
	            {
	                count++;
	            }
	        }
	        System.out.println("\nNo of Occurence found: " + count);
	    }
	}

		
