package tutorial;

import java.util.Scanner;

public class Lcm2 {

	public static void main(String[] args) {

Scanner s=new Scanner (System.in);
		int n1,n2,i=2,lcm,b;
		System.out.println("enter 1st num");
		System.out.println("enter 2nd num");
		    n1=s.nextInt();
		    n2=s.nextInt();
		    if(n1>n2)
			lcm=n1;
		    else
			lcm=n2;
		  b=lcm;
		   while(lcm%n1!=0 || lcm%n2!=0)
			{
			lcm=b*i;
			i++;
			}
	 
	 	 System.out.println("LCM of "+n1+" and "+n2+" is ="+lcm);
		
		

	}

}
