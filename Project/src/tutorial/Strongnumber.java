package tutorial;

import java.util.Scanner;

public class Strongnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		 int a,b,r,sum=0,sum1=0;
      
         System.out.println("Enter A Number");
         b=s. nextInt() ;
         a=b;
         while(b>0)
               {
        	 r=b%10;
             
             
                   
                   int j;
           		int fact=1;
                      
                      for(j=1 ;j<=r;j++)
                      {
                           fact=fact*j;
                           sum=sum+fact;
                      
                     sum1=sum+sum1;
                      }
                      b=b/10;
                      
                    System.out.println(sum1); 
                   
                   
               }
          if(a==sum1)
          {
             System.out.println(a+" is a strong number");
          }
          else
          {
             System.out.println(a+" is not a strong number");
        }}}
               