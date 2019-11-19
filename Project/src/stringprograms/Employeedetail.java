package stringprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employeedetail {

	public static void main(String[] args) throws IOException {
		StringBuffer s=new StringBuffer("Employee details");
	
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);            
	    System.out.println("Enter your name");    
	    String name=br.readLine();    
	    
	    System.out.println("Enter your age:");
	   String age=br.readLine();   
	    System.out.println("Enter your position:\n");
	    String pos=br.readLine();  
	    System.out.println("salary  :\n");
	    String sal=br.readLine();  
	    System.out.println("Welcome :"+name);
	    System.out.println("age:  "+age);  
	    System.out.println("position:  "+pos); 
	    System.out.println("salary:  "+sal); 
   
	
	
	
	}

}
