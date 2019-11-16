package interfacepgms;

import java.util.Scanner;

//import abstractpgms.Studenttt;

public class Interfacepgms {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("enter the name");
		String name=s.next();
		System.out.println("enter the id");
		int id=s.nextInt();
		System.out.println("enter the total");
		int t=s.nextInt();
		Student11 s1=new Student11();
		s1.detail(name,id);
		s1.total(t);
	}}
		
		interface rank
		{
			public void detail(String name,int id);

	}
		interface total {
			public void total (int t);

}
		class Student11 implements rank,total {
			public void detail(String name,int id)
			{
				System.out.println("Name"+name);
				System.out.println("Id"+id);
				
			}
			public void total (int t) {
				System.out.println("total"+t);
			}
		}
