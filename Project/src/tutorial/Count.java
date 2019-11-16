package tutorial;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {


	
				Scanner s = new Scanner(System.in);
				System.out.println("enter string");
				String str=s.nextLine();
				
				//char c=s.next().charAt(0);
				int u=0,c=0,v=0;int i;
				for(i=0;i<str.length();i++)
				{

				if(str.charAt(i)=='a'|| str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
				{
					//System.out.println("vowel");
					v++;
				}
				else if(str.charAt(i)>65&&str.charAt(i)<97)
				{
					//System.out.println("uppercase");
					u++;
			}
				else
					c++;
				}
				System.out.println("uppercase");
				System.out.println(u);
				System.out.printf("\nvowel %d",v);
				System.out.printf("\nconsonants %d",c);
				
		}

		
		

}
