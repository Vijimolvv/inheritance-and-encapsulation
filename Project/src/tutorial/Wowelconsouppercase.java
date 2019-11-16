package tutorial;

import java.util.Scanner;

public class Wowelconsouppercase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter character");
		char c=s.next().charAt(0);
		
		
		 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("vowel");
		}
		else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			System.out.println("wowel and uppercase");	
			
		}
		else if(c>65&&c<97)
		{
			System.out.println("Uppercase letter");
		}
		
		else
		{
			System.out.println("consonant");	
		
	}
	}
}
