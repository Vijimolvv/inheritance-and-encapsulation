package tutorial;

import java.util.Scanner;

public class Stringrevusingrecursion {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		        String str = s.nextLine();
		        String reversed = reverseString(str);
		        System.out.println("The reversed string is: " + reversed);
		    }

		    public static String reverseString(String str)
		    {
		        if (str.isEmpty())
		            return str;
		        //Calling Function Recursively
		        return reverseString(str.substring(1)) + str.charAt(0);
		    }
		}
