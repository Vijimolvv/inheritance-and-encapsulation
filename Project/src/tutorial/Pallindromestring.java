package tutorial;

import java.util.Scanner;

public class Pallindromestring {

	public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
		int x,i;
		System.out.print("enter a string");
		      String str=s.nextLine();
		     x= str.length();
		      String rev="";
		      for(i=x-1;i>=0;i--)
		      {
		          rev=rev+str.charAt(i);
		           }
		      if(rev.equals(str))
		      {
		     
		        System.out.print("Palindrome");
		      }
		      else
		      {
		        System.out.print("Not a Palindrome");
		      }
			}
	}