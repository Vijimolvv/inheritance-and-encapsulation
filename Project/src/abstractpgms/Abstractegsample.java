package abstractpgms;

import java.util.Scanner;

public class Abstractegsample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
			Studentt s1=new Studentt();
			System.out.println("enter the name");
			String name=s.next();
			System.out.println("enter the id");
			int id=s.nextInt();
			System.out.println("enter number");
			int d=s.nextInt();
			
			s1.totalmark(name,id,d);
		s1.rank1();
	}
}
	abstract class rank
	{
		abstract void totalmark(String name,int id,int d);
		public void rank1()
		{
			System.out.println("Rank 2");
		}}
		
