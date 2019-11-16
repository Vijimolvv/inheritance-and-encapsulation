package tutorial;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int number=s.nextInt();
		int c = 0;
		while(number>0)
		{
			int digit=number%10;
			number=number/10;
			c++;
		}
		
		int i;
		//int length=s.number.length();
		//int length = String.valueOf(number).length();
		for(i=0;i<=c;i++)
		{
			
			int str1=number+10;
			char s1=(char)str1;
		
		System.out.println(s1);

	}

}}
