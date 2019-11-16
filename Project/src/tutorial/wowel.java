package tutorial;

import java.util.Scanner;

public class wowel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter character");
		char c=s.next().charAt(0);
		if(c=='a'|| c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("consonant");	
	}}

}
