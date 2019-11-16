package polymorphism;

import java.util.Scanner;

public class Polystudent {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Student Details");
		System.out.println("enter name");
		Add1 a=new Add1();
		String name=s.nextLine();

		System.out.println("enter mark1");
		int m1=s.nextInt();
		System.out.println("enter mark2");
		int m2=s.nextInt();
		System.out.println("enter mark3");
		int m3=s.nextInt();
		System.out.println("enter mark4");
		int m4=s.nextInt();
		System.out.println("enter mark5");
		int m5=s.nextInt();

		a.avg(m1,m2,m3,m4,m5);
		//int rank = 0;
		 int rank1 = (m1+m2+m3+m4+m5);
		a.avg(rank1);
		

		}

	}
	class Add1
	{

		public void avg(int m1, int m2, int m3, int m4, int m5) {
			
		  int rank = (m1+m2+m3+m4+m5);
		 int av = rank/5;

		 System.out.println(rank);
		
		 System.out.println(av);
			
		}

		public void avg(int rank1) {
			if(rank1>449)
			{
				System.out.println("FIRST RANK");
		}
			else if(rank1>400&&rank1<448)
			{
				System.out.println("SECOND RANK");	
			}
			else if(rank1>350&&rank1<399)
			{
				System.out.println("THIRD RANK");
			}
			else if(rank1>300&&rank1<349)
			{
				System.out.println("Fourth RANK");
			}
			else
				System.out.println("Failed");
		}
			

	}


