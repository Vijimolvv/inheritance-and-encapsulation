package inheritance;

import java.util.Scanner;
public class Heirinheritanceassessment {

	
	    
	    
	    public static void main(String args[])
	     {
	       Scanner s=new Scanner(System.in);
	       
	      
	      
	      
	       
	        
	        
	        System.out.println("Enter the details of Sports Bike :");
		       System.out.println("Name of the bike :");
		       String name=s.next();
		        System.out.println("Color of the bike :");
		        String color=s.next();
		        System.out.println("Capacity(CC) of the bike :");
		        Float cc=s.nextFloat();
		        System.out.println("Speed of the bike :");
		        int speed=s.nextInt();
		        System.out.println("Price of the bike :");
		        double price=s.nextDouble();
		       System.out.println("Discount of the bike :");
		       int discount=s.nextInt();
		       //System.out.println("Weight of the bike :");
		       
		        System.out.println("Enter the details of Scooter");
		        System.out.println("Name of the Scooter ;");
		        String name1=s.next();
		        System.out.println("Color of the Scooter");
		        String color1=s.next();
		        System.out.println("Capacity(CC) of the Scooter");
		        Float cc1=s.nextFloat();
		        System.out.println("Speed of the Scooter");
		        int speed1=s.nextInt();
		        System.out.println("Price of the Scooter");
		        double price3=s.nextDouble();
		       System.out.println("Discount of the scooter :");
		       int discount1=s.nextInt();
		         System.out.println("Weight of the Scooter:");
		         int weight=s.nextInt();
	        Bike obj1=new Bike();
	      SportBike obj2=new SportBike();
	      Scooter obj3=new Scooter();
	      
	     // obj1.display(name,color,cc,speed,price);
	      obj2.display(name,color,cc,speed,price,discount);
	      obj3.display(name1,color1,cc1,speed1,price3,discount1,weight);
       
	      
	     }
	    }
	    class Bike
	    {
	     String name;
	     String color;
	     Float cc;
	     int speed;
	    Double price;
	      Double discount;
	    
	     public void display(String name,String color,Float cc,int speed, Double price)
	     {
	       this.name=name;
	       this.color=color;
	       this.cc=cc;
	       this.speed=speed;
	       this.price=price;
	       this.discount=discount;
	       
	         
	    }
	    
	     }
	      
		
		
		

