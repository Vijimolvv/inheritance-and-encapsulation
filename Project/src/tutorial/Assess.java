package tutorial;

import java.util.Scanner;

public class Assess {

	public static void main(String[] args) {


		 Scanner s=new Scanner (System.in);
		 System.out.print("Enter the year");
		  int n=s.nextInt();
		  String w= Integer.toString(n);  
		  int sum=0,count=0,i;
		int digit=0,num;
		int d=w.length();
		  while(n>0)
		  {
			  num=n%10;
			  digit=(int) (sum+Math.pow(num, d));
		  n=n/10;
	
		 
		  
		  System.out.print(digit);
	}}

}
