package stringprograms;

import java.util.Scanner;

public class Casestudy {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer a=new StringBuffer();
		 System.out.println("Registration");
System.out.println("enter the name");
		
		a.append("\nName: "+s.nextLine());
		
		
		
		   
		  
		   System.out.println("Enter your address");
		   a.append("\nAddress: "+s.nextLine());
			
		   System.out.println("Contact Number");
		   a.append("\nContact Number: "+s.nextLine());
			
		System.out.println("E-Mail ID");
		a.append("\nE-mail ID: "+s.nextLine());
		 
		   System.out.println("Enter proof type");
		   a.append("\nProof Type: "+s.nextLine());
			
		   System.out.println("Enter proof id");
		   a.append("\nproofid: "+s.nextLine());
			System.out.println("Thank you for registering. Your id is 1...");
			  System.out.println("Do you want to continue registration?(y/n)");
			  char ch=s.next().charAt(0);
			  if(ch=='y')
			  {
			  System.out.println(a);
			  }
			  else
			  {
				  System.out.println("Registration not needed");  
			  }
		
	}}


