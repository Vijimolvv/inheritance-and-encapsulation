package tutorial;

import java.util.Scanner;

public class Dec2oct {

	public static void main(String[] args) {
		
		
				        int n, count = 0, a;
				        String x = "";
				        Scanner s = new Scanner(System.in);
				        System.out.print("Enter any decimal number:");
				        n = s.nextInt();
				        while(n > 0)
				        {
				            a = n % 8;
				            
				         x = a + x;
				            n = n / 8;
				        }
				        System.out.println(" octal number:"+x);
				       
				    }
				}
				
			

		
