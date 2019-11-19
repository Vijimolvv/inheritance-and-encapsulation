package Patternnew;

import java.util.Scanner;

public class Patternalpha4new {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter a num");
		 int num=s.nextInt();
		 int alphabet = 65;
	        System.out.println("** Printing the pattern... **");
	        for (int i = 0; i <= num; i++)
	        {
	            for (int j = i; j <= 0; j--)
	            {
	                System.out.print((char) (alphabet ) + " ");
	            
	            
           
           alphabet--;
	            }
           System.out.println();
	            
	        }


	}

}
