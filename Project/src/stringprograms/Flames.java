package stringprograms;

import java.util.Scanner;

public class Flames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String str1=s.nextLine();
		
		System.out.println("enter string");
		String str2=s.nextLine();
		int i=0,j=0,val=0;
		
		String h1[]=str1.split(" ");
		for( i=0;i<h1.length;i++)
		{
		System.out.printf(h1[i]);
		}
		String h2[]=str2.split(" ");
		for(i=0;i<h2.length;i++)
		{
		System.out.printf(h2[i]);
		}
		for( i=0;i<str1.length();i++)
				{
			 if(h2.equals(h1))
			 {
				 System.out.printf(h2[i]);
				}else
				{
					System.out.printf(h2[i]);
				}
				
				
		
		
		
		
		 int m=str1.length();
		        int n=str2.length();
		        for( i=0; i<m;i++)
		        {
		            for( j=0; j<n;j++)
		            {
		                if(str1.charAt(i) == str2.charAt(j))
		                {
		                    str1.replace("str1.charAt(i)", "0"); 
		                    str2.replace("str2.charAt(j)","0");
		                }
		            }
		        }
		 
		
		 
		        int x1=0;
		        int y1=0;
		        String s1="";
		        String s2="";
		        s1 = str1.toString();
		        s2 = str2.toString();
		            for(i=0;i<s1.length();i++){ //length of string to remove 0 and find the length
		                if(s1.charAt(i)!='0'){
		                    System.out.print(" "+s1.charAt(i));
		                    x1 +=1;
		                    
		                 }
		            }
		            System.out.println();
		            System.out.println("First String: "+x1);
		    
		            for( i=0;i<s2.length();i++){
		            if(s2.charAt(i)!='0'){
		                System.out.print(" "+s2.charAt(i));
		                y1 +=1;
		                
		                }
		            } 
		            System.out.println();
		            System.out.println("Second String: "+y1);
		       
		        
		        int x = x1+y1; // total length of remaining characters in both the strings
		        System.out.println("Length is: "+x);
		 
		   
		     
		        String flames = "flames";
		        StringBuilder sb3 = new StringBuilder(flames);
		        
		        char flameResult = 0;
		        
		        while(sb3.length()!=1)
		        {
		            int y = x%sb3.length(); 
		            String temp;
		            
		            if(y!=0)
		            {
		                temp = sb3.substring(y)+sb3.substring(0, y-1); // taking substring (counting purpose)
		                
		            }
		            else
		            {
		                temp = sb3.substring(0, sb3.length()-1); // taking substring (counting purpose)
		                
		            }
		            sb3 = new StringBuilder(temp);
		            char relationIs = sb3.charAt(0);
		            
		        }
		        System.out.printf("flameResult %s",flameResult);
		 
		
			
		
		        switch(flameResult)
		        {
		            case 'f':
		                System.out.println("Friends");
		                break;
		            case 'l':
		                System.out.println("Love");
		                break;
		            case 'a':
		                System.out.println("Affection");
		                break;
		            case 'm':
		                System.out.println("Marriage");
		                break;
		            case 'e':
		                System.out.println("Enemies");
		                break;
		            case 's':
		                System.out.println("Sibling");
		                break;
		                
		        }
		    }
		 
	}}

		
		
		
		
		
		
		
		
		

		


