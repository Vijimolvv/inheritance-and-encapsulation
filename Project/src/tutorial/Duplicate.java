package tutorial;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		String[] strArray =new String[n]; 
        System.out.println("Given array elements are: ");
        
        
        for (int i = 0; i < strArray.length; i++)
        {
        	System.out.print("Enter " + (i+1 ) + " name : ");
            strArray[i] = s.next();
        }
        
        
        
        for (int i = 0; i < strArray.length; i++)
        {
                System.out.print(strArray[i]+" ");
        }
        
        for (int i = 0; i < strArray.length; i++)
        {
                for (int j = i+1; j < strArray.length; j++)
                {
                        if( (strArray[i].equals(strArray[j])) && (i != j) )
                        {
                                System.out.println("\nDuplicate Element is : "+strArray[j]);
                        }
                        
                       
                }
        
        
        }
        
	}

}
