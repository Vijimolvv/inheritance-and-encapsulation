package tutorial;

import java.util.Scanner;

public class Testvv {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int xss,i;
		String str=s.nextLine();
		xss=str.length();
		String banagram="";
		for(i=xss-1;i>0;i--)
		{
			banagram=banagram+str.charAt(i);
			
		}
		
if (banagram.equals( str))
{
	System.out.println("Yes");
	
}
{
	System.out.println("no");
	
}
	}

}
