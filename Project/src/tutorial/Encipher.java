package tutorial;

import java.util.Scanner;

public class Encipher {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		int i;
		for(i=0;i<str.length();i++)
		{
		int c=str.charAt(i);
		c=c+2;
		char d=(char)c;
		System.out.println(d);
		}

	}

}
