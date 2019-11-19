package stringprograms;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		//System.out.println("enter sub string");
		//String str1=s.nextLine();
		String h[]=str.split(" ");
		//System.out.println("enter size");
		//int n= s.nextInt();
		//int count[]=new int[n];
		int x=0;int i=0,max=0,max1=0;
		for( i=0;i<h.length;i++)
		{
		
		System.out.printf("\nsubstring :%s ",h[i]);
		System.out.printf("\ncount:   %d ",h[i].length());
		}
		for( i=0;i<h.length;i++)
		{
		if(h[i].length()>max)
		{
			max=h[i].length();
			
		}}
		System.out.printf("\nmax %d ",max);
		
		for( i=0;i<h[i].length();i++)
		{
		if(max==h[i].length())
		{
		System.out.printf("\nlargest string is %s ",h[i]);
		}}
		
		
		
		
		

}}
