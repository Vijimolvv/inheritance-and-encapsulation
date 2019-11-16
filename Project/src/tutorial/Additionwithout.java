package tutorial;

import java.util.Scanner;

public class Additionwithout {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		 System.out.println("enter the first");
		 int a=s.nextInt();
		 System.out.println("enter 2 nd ");
		 int b=s.nextInt();
		 while(a!=0)
		 {
			int sa=a^b;
		int	c=(a&b)<<1;
		b=sa;
		a=c;
		 }
		 System.out.printf("%d",b);
		 }
		 

	}


