package tutorial;

import java.util.Scanner;

public class Pppp {

	public static void main(String[] args) {

	
		
		   Scanner s=new Scanner(System.in);
			  int n=s.nextInt();
			  int sum=0,digit,pro=1;
			  int num,num1;int a=n;
			  while(n!=0)
			  {
				  num=n%10;
				  sum=sum+num;
				  n=n/10;
				   
			  }
			  System.out.println(sum); 
			 
			  while(a!=0)
			  {
				  num1=a%10;
				  pro=pro*num1;
				  a=a/10;
				  
			  }
			  System.out.println(pro);
			  
			  if (sum==pro)
			  {
				  System.out.println("Sum and product of digits are same");
			  }
			  
		  }
		}
		

