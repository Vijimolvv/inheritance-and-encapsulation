package inheritance;
import java.util.Scanner;
public class Bookin {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Seasonbooking sb=new Seasonbooking();
		System.out.println("Enter the number of persons");
		int p=s.nextInt();
		System.out.println("Enter the number of days");
		int da=s.nextInt();
		System.out.println("Enter the room type");
		String r=s.next();
		System.out.println("Enter the tarrif for single person");
		double t=s.nextDouble();
		sb.tariff(p,da,r,t);
	}

}
