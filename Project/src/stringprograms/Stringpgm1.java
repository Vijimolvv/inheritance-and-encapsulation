package stringprograms;

import java.util.Scanner;

public class Stringpgm1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		 System.out.println("enter a string");
String str=s.nextLine();
System.out.println("enter a string1");
String str1=s.nextLine();
System.out.println("enter a string2");
String str2=s.nextLine();
boolean j=str2.contentEquals(str1);
System.out.println(j);
int a=str.length();
System.out.printf("length %d \n",a);
char b=str.charAt(4);
System.out.printf(" character  %s \n",b);
String c=str.substring(2,5);
System.out.printf("substring %s\n ",c);
boolean d=str.startsWith("the");
System.out.println(d);
int e=str1.indexOf("the");
System.out.printf("index  %d \n",e);
String f=str.concat(str2);
System.out.printf("concatenation %s \n",f);
String g=str.replace("the", "that");
System.out.printf("replace  %s\n",g);
String h[]=str.split(" ");
for(int i=0;i<h.length;i++)
{
System.out.printf(h[i]);
}


	}

}
