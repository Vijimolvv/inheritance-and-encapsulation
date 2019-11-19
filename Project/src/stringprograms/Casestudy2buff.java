package stringprograms;

import java.util.Scanner;



public class Casestudy2buff {

	public static void main(String[] args) {
		
		   //Calories x = new Calories();
		   System.out.println("1.Car\n2.Bike");
		   System.out.println("Enter the choice");
			Scanner s = new Scanner(System.in);
		   int c = s.nextInt();
		   
			
		   
		   Car12 p=new Car12();
		   Bike q=new Bike();
		   switch(c)
		   {
		     case 1:p.view1();
		    	 
		       break;
		     case 2:
		    	 q.view1();
		       break;
		     
		  
		     default:
		        System.out.println("Invaild option");
		       break;
		   }
}

}

class Car12 {
public void view1()
{
	Scanner s = new Scanner(System.in);
	StringBuffer a=new StringBuffer();
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

}
class Bike{
public void view1()
{Scanner s = new Scanner(System.in);
	StringBuffer b=new StringBuffer();
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
