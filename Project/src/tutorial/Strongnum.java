package tutorial;

import java.util.Scanner;

public class Strongnum {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		        int input = s.nextInt();
		        
		        int temp, mod, sum = 0;
		    
		        temp = input;
		    
		        while(input > 0)
		        {
		            mod = input % 10;
		    
		            sum=sum + fact (mod);
		    
		            input  = input /10;
		                    
		        }
		        if(temp == sum)
		        {
		            System.out.println(temp +" is a strong number");
		        }
		        else
		        {
		            System.out.println(temp +" is not a strong number");
		        }
		    }
		    public static int fact(int num)
		    {
		        int fact=1;
		    
		        for(int i = 1; i <= num; i++)
		        {
		            fact *= i;
		        }
		        return fact;
		    }
		        
		}
		
		
		
