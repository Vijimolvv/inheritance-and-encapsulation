package tutorial;

import java.util.Scanner;

public class Missingnumbes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	     System.out.println("Enter the string:");
	     String str=s.nextLine();
	     char a[]=str.toCharArray();
	     int c[]=new int[26];
	     for(int i=0;i<a.length;i++)
	     {
	         if(a[i]!=' ')
	         {
	             c[a[i]-'a']++;
	         }
	     }
	     String s2="";
	     for(int i=0;i<26;i++){
	         if(c[i]==0){
	             s2=s2+(char)(i+'a');
	         }
	     }
	     System.out.println(s2);

	}

	}
