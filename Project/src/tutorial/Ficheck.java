package tutorial;

import java.util.Scanner;

public class Ficheck {

	

			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				
				int a=0,b=1,m=0;
				System.out.println("enter a limit");
				
				int n=s.nextInt();
				//System.out.println(a);
				//System.out.println(b);
				for(int i=0;i<(2*n);i++)
				{
					int c=a+b;
					if(c==n)
					{
						m++;
					}
				
				
				a=b;
				b=c;
				}
				if(m!=0)
				{
					System.out.println("yes");
				}
				else
				{
					System.out.println("no");
			}

			}

	}


