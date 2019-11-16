package abstractpgms;

import java.util.Scanner;

public class Abstrstudent {

	public static void main(String[] args) {


		
				Scanner s=new Scanner(System.in);
				
					Studenttt s1=new Studenttt();
					System.out.println("enter the name");
					String name=s.next();
					System.out.println("enter the id");
					int id=s.nextInt();
					System.out.println("enter the mark1");
					int m1=s.nextInt();
					System.out.println("enter the mark2");
					int m2=s.nextInt();
					System.out.println("enter the mark3");
					int m3=s.nextInt();
					System.out.println("enter the mark4");
					int m4=s.nextInt();
					
					
					s1.totalmark(name,id,m1,m2,m3,m4);
				s1.rank2();
			}
		}
			abstract class rankx
			{
				abstract void totalmark(String name,int id,int m1,int m2,int m3,int m4);
				public void rank2()
				{
					//System.out.println("Rank 2");
				}
				
	}

