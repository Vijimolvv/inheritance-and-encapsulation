package tutorial;

import java.util.Scanner;

public class Powerof {

	public static void main(String[] args) {
		
		        Scanner s=new Scanner(System.in);
		        System.out.println("enter the exponent");
		        int exponent=s.nextInt();
		        System.out.println("enter the base");
		        int base=s.nextInt();
		        long result = 1;
		        while (exponent != 0)
		        {
		            result *= base;
		            --exponent;
		        }
		        System.out.println("Answer = " + result);
		    }
		}

	
