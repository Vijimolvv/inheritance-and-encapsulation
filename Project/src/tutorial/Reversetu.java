package tutorial;

import java.util.Scanner;

public class Reversetu {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int reversed=0;
		int num=s.nextInt();
		
		while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
System.out.println(reversed);
	}

}
