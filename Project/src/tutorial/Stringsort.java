package tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class Stringsort {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		       
		System.out.print("enter the value  : ");
        int size = s.nextInt();
		        String[] names = new String[size];
		         for (int i = 0; i<size; i++)
		        {
		            System.out.print("Enter " + (i+1 ) + " name : ");
		            names[i] = s.next();
		        }
		       
		        Arrays.sort(names);

		        System.out.println("Sorted names");
		        
		        for(int i=0;i<size;i++)
		        {
		            System.out.println("\t" + names[i]);
		        }
		    }
		

}
