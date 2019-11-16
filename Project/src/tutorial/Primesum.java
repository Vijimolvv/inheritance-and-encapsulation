package tutorial;

import java.util.Scanner;

public class Primesum {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter the  limit");
			int num1=s.nextInt();
			
			int i,j,flag=0,sum=0;
			
			for(i=0;i<num1;i++)
			{
				for(j=2;j<i;j++)
				{
					if(i%j==0)
					{
						flag=0;
						
						break;
						
				
					}
					else {
						
						flag=1;	
						//
						}
				}
				if(flag==0)
				{
					for(i=0;i<num1;i++)
					{
						sum=sum+i;
				
					
					}
					System.out.println(sum);
				}
				
			}}}