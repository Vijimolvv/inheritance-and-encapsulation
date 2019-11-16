package inheritance;

public class Scooter extends Bike{
	public void display(String name1, String color1, Float cc1, int speed1, double price3,double discount1,int weight)
	{
		
	double price1 = price3-discount1;
    System.out.printf("Name : %s\n",name1);
       System.out.printf("Color : %s\n",color1);
       System.out.printf("Capacity : %f\n",cc1);
       System.out.printf("Speed : %d\n",speed1);
       System.out.printf("Price : %.2f\n",price3);
       System.out.printf("Manufacturer Discount : %.2f\n",discount1);
       System.out.printf("Scooter weight is  : %d\n",weight);
	System.out.printf("Scooter price is  : %f\n",price1);

	
	
	
	
	
	
		
	}

}
