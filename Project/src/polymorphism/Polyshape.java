package polymorphism;

import java.util.Scanner;

public class Polyshape {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		//System.out.println("Aryaas");
		//System.out.println("enter hotel ");
		Food a=new Food();
		//String name=s.nextLine();

		System.out.println("masala");
		int m1=s.nextInt();
		System.out.println("poori");
		int m2=s.nextInt();
		System.out.println("chappathi");
		int m3=s.nextInt();

		System.out.println("DOSA");
		int m4=s.nextInt();
		System.out.println("GHEE ROAST");
		int m5=s.nextInt();
		


		a.veg(m1,m2,m3);
		
		
		a.veg(m4,m5);
		

		}

	}
	class Food
	{

		public void veg(int m1, int m2, int m3) {
			
			int total=m1+m2+m3;
			System.out.printf("veg1 =: %d ",total);
			System.out.println("Thank you visit again");
			if(total>200)
			{
				System.out.println("you have a coupon worth up to 500");
				
			}
			else
			{
				System.out.println("better luck next time");
			}
		}

		public void veg(int m4, int m5) {
			int total1=m4+m5;
			System.out.printf(" veg  =: %d",total1);
			System.out.println("Thanks");
		}


	

}

