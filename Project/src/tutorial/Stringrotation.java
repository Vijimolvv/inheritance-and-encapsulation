package tutorial;

import java.util.Scanner;

public class Stringrotation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.next();

		String str2="";
		int l=str.length();
		int i;
		 
		  for(i=l/2;i<l;i++)
		   {  
		str2=str2+str.charAt(i);
		   }
		  for(i=0;i<l/2;i++)
		   {  
		str2=str2+str.charAt(i);
		   }
		 
		 // if(str.equals(str2))
		 //// {
		 // System.out.printf(str2);  
		 // }
		  //else
		  System.out.printf(str2);

	}

}
