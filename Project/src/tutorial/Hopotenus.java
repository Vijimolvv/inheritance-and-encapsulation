package tutorial;

import java.util.Scanner;

public class Hopotenus {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the base measurement");
		int b=s.nextInt();

		System.out.println("enter the hight measurement");
		int l=s.nextInt();
		
		int xx=  (int) Math.sqrt(b*b+l*l);  //(int)sqrt(b*b+l*l);
		System.out.printf("the  hipotenus measurement %d ",xx);
	}

}
