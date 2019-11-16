package tutorial;

import java.util.Scanner;

public class Palindronumber {

	public static void main(String[] args) {
		
		
		
		
		
		
		

		

				Scanner s=new Scanner(System.in);
				System.out.println("enter the no");
				int reversed=0;
				int num=s.nextInt();
			int	num1=num;
				while(num != 0) {
		            int digit = num % 10;
		            reversed = reversed * 10 + digit;
		            num /= 10;
		        }
		System.out.println(reversed);
		if(num1==reversed)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not a Pallindrome");
		}
			
			}

		}
