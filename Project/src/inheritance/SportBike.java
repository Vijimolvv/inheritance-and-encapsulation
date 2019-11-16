package inheritance;

public class SportBike extends Bike {
	public void display(String name, String color, Float cc, int speed, double price,double discount)
	{
		

	    double price2 = price-discount;
	    System.out.printf("Name :%s\n",name);
	       System.out.printf("Color %s \n:",color);
	       System.out.printf("Capacity %f\n:",cc);
	       System.out.printf("Speed :%d \n",speed);
	       System.out.printf("Price :%f\n",price);
	       System.out.printf("Manufacturer Discount %f:\n",discount);
	       System.out.printf("Bike price is  %f:\n",price2);
	    }}



