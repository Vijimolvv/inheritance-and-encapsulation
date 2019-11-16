package tutorial;

import java.util.Scanner;

public class Substringreplacing {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		System.out.println("Enter the substring1");
		String sub1=s.nextLine();
		System.out.println("Enter the substring2");
		String sub2=s.nextLine();
		String str4=str.replace(sub1,sub2);
		System.out.println(str4);

	}

}
