package tutorial;

import java.util.Scanner;

public class Gcdof2num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the  number1");
		System.out.println("enter the  number2");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int gcd=1;
		
		for(int i = 1; i <= num1 && i <= num2; ++i)
        {
           
            if(num1 % i==0 && num2 % i==0)
                gcd = i;
        }
        System.out.printf("G.C.D of %d and %d is %d", num1, num2, gcd);
	}

}
