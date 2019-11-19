package assessment;

import java.util.Scanner;

public class REvoriginal {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
		 System.out.println("enter a num");
		 int n=s.nextInt();
		 
		 int org=n;
		 int rev=n,digit=0,sum=0,sum1=0,digit1=0;
		 while(org>0)
		 {
			 digit=org%10;
			 sum=sum+digit;
			org= org/10;
			 
		 }
System.out.println(sum);


while(rev>0)
{
	 digit1=rev%10;
	 sum1=sum1+digit1;
	org= org/10;
	 
}

	}

}
