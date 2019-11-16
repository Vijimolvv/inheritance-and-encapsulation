package tutorial;

import java.util.Scanner;

public class Binary2octnew {

	public static void main(String[] args) {

Scanner s=new Scanner(System.in);
        
        System.out.println("Enter a binary number:");
        int n=s.nextInt();
        String x = "";
        int decimal=0,p=0,oct=0,oct1=0,a=0;
        
        while(n!=0)
        {
            decimal+=((n%10)*Math.pow(2,p));
            n=n/10;
            p++;
        }
        System.out.println("decimal");
        System.out.println(decimal);
	oct	=decimal;
	
	
	while(oct!=0)
    {
		
            oct1 = oct%8;
            
       x= oct1+x;
            oct = oct/8;
        }
        System.out.println(" octal number:"+x);
    }
	

	}

