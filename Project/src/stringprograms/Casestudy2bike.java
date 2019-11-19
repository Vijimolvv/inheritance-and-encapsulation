package stringprograms;

import java.util.Scanner;

public class Casestudy2bike {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer a=new StringBuffer();
		StringBuffer b=new StringBuffer();
		 System.out.println("1.Car\n2.Bike");
		   System.out.println("Enter the choice");
		   int c = s.nextInt();
		   if(c==1)
		   {
			   
			   System.out.println("Enter the details of car");
		       System.out.println("Enter the color");
		       a.append("\ncolor: "+s.next());
		        System.out.println("Enter the max speed");
		      a.append("\nSpeed: "+s.next());
		      System.out.println("Enter the no of seats");
		      a.append("\nseats: "+s.next());
		      System.out.println("Enter the no of wheels");
		      a.append("\nwheels: "+s.next());
		      System.out.println("Enter the no of doors");
		      a.append("\ndoors: "+s.next());
		      System.out.println("Enter the status of AC(true/false)");
		      a.append("\nAC/NAC: "+s.next());
		      System.out.println(a);
		   }
		      
		   else
		   {
			   System.out.println("Enter the details of bike");
			      
		       System.out.println("Enter the color");
		       b.append("\ncolor: "+s.next());
			      
			      System.out.println("Enter the max speed");
			      b.append("\nspeed: "+s.next());
			      System.out.println("Enter the no of seats");
			      b.append("\nseat: "+s.next());
			      System.out.println("Enter the no of wheels");
			      b.append("\nwheels: "+s.next());
			      System.out.println("Enter the no of doors");
			      b.append("\ndoor: "+s.next());
			      System.out.println("Enter the status of AC(true/false)");
			      b.append("\nAC/NAC: "+s.next());
			      System.out.println(b);
		   }

	}

}
