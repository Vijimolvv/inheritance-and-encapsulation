package tutorial;

import java.util.Scanner;

public class Fibsum {

	public static void main(String[] args) {


		
		
		
				Scanner s=new Scanner(System.in);
				
				int a=0,b=1,c=0,sum=0,sum1=0;
				System.out.println("enter a limit");
				
				int n=s.nextInt();
			//	System.out.println(a);
				//System.out.println(b);
				for(int i=0;i<n;i++)
				{
					c=a+b;
					a=b;
					b=c;
					
				//System.out.println(c);
				if(c%2==0)
				{
					sum=sum+c;
					System.out.println(sum);
				}
				if(c%2==1)
				{
					sum1=sum1+c;
					System.out.println(sum1);
				}
				
				}
					
				}}
				
				
			


		

		
		
		

