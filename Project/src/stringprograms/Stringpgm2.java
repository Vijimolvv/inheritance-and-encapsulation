package stringprograms;

import java.util.Scanner;

public class Stringpgm2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		 System.out.println("enter a string");
String str=s.nextLine();
String h[]=str.split(" ");
int i,e,j;
for( i=0;i<h.length;i++)
{
	if(i%2!=0) {
		int l=h[i].length();
		for(j=l-1;j>=0;j--)
		{
			System.out.print(h[i].charAt(j));
		}
		System.out.print(" ");
	}
	else {
		System.out.print(h[i]+" ");
	}
}}}
	
