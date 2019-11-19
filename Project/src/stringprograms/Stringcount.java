package stringprograms;

import java.util.Scanner;

public class Stringcount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		
		
		int u=0,c=0,v=0;int i,count,special=0,space=0,digit=0;
		int a=str.length();
		System.out.printf("length %d \n",a);
		for(i=0;i<str.length();i++)
		{

		if(str.charAt(i)=='a'|| str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
		{
			//System.out.println("vowel");
			v++;
		}
		//else if(str.charAt(i)=='@'||str.charAt(i)=='#'||str.charAt(i)=='$'||str.charAt(i)=='&')
		//{
		//	special++;
		//}
		else if(str.charAt(i)==' ')
		{
		space++;
		}
		else if(str.charAt(i)>65&&str.charAt(i)<97)
		{
			//System.out.println("uppercase");
			u++;
	}
		
		
		else if((str.charAt(i)>33&&str.charAt(i)<47)||(str.charAt(i)>58&&str.charAt(i)<64)||(str.charAt(i)>123&&str.charAt(i)<126)||(str.charAt(i)>91&&str.charAt(i)<96))
		{
			//System.out.println("uppercase");
			special++;
	}
		
		
		
		
		else if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
		{
			
			digit++;
	}
		
		else
			c++;
		}
		System.out.println("uppercase");
		System.out.println(u);
		System.out.printf("\nvowel %d",v);
		System.out.printf("\nconsonants %d",c);
		System.out.printf("\nspecial characters %d",special);
System.out.printf("\n no of spaces %d",space);
System.out.printf("\n no of digit %d",digit);
	}}


