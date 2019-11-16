package tutorial;

import java.util.Scanner;

public class Sumdidituntil {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int digit, sum=0;
		while(n>0)
		{
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
System.out.println(sum);
	}

}
