package polymorphism;

import java.util.Scanner;

public class Polycasestudy {

	public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			   //Calories x = new Calories();
			   System.out.println("1.Car\n2.Bike");
			   System.out.println("Enter the choice");
			   int c = s.nextInt();
			   String color,aa;int speed,seat,wheel,door;
			   Car12 p=new Car12();
			   Bike q=new Bike();
			   switch(c)
			   {
			     case 1:
			       System.out.println("Enter the details of car");
			       System.out.println("Enter the color");
			       
			      color= s.next();
			      System.out.println("Enter the max speed");
			      speed = s.nextInt();
			      System.out.println("Enter the no of seats");
			      seat = s.nextInt();
			      System.out.println("Enter the no of wheels");
			      wheel = s.nextInt();
			      System.out.println("Enter the no of doors");
			      door = s.nextInt();
			      System.out.println("Enter the status of AC(true/false)");
			    aa = s.next();
			      
			      
			      p.view1(color, speed, seat, wheel, door, aa);
			       break;
			     case 2:
			    	 System.out.println("Enter the details of bike");
			      
			       System.out.println("Enter the color");
			       
				      color= s.next();
				      System.out.println("Enter the max speed");
				      speed = s.nextInt();
				      System.out.println("Enter the no of seats");
				      seat = s.nextInt();
				      System.out.println("Enter the no of wheels");
				      wheel = s.nextInt();
				      System.out.println("Enter the no of doors");
				      door = s.nextInt();
				      System.out.println("Enter the status of AC(true/false)");
				     aa = s.next();
				     q.view1(color, speed, seat, wheel, door, aa);
			       break;
			     
			  
			     default:
			        System.out.println("Invaild option");
			       break;
			   }
	}

}

class Car12 {
	public void view1(String color,int speed  ,int seat,int wheel,int door,String aa)
	   {
		System.out.println("Car Details");
		System.out.println("Color :"+color); 
		System.out.println("Maximum Speed : "+speed);
		System.out.println("Number of Seats :"+seat);
		System.out.println("Number of Wheels :"+wheel);
	System.out.println("door:"+door);
	System.out.println("AC/nAC:"+aa);
	
	   }
	
}
class Bike{
public void view1(String color,int speed  ,int seat,int wheel,int door,String aa)
{
	System.out.println("Bike Details");
	System.out.println("Color :"+color); 
	System.out.println("Maximum Speed : "+speed);
	System.out.println("Number of Seats :"+seat);
	System.out.println("Number of Wheels :"+wheel);
System.out.println("door:"+door);
System.out.println("AC/nAC:"+aa);

	
}
}

