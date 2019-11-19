package assessment;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a total height");
		int totheight=s.nextInt();
		 
		 System.out.println("enter a total height1");
	  int height1=s.nextInt();
	  System.out.println("enter a total height2");
	  int height2=s.nextInt();
	  System.out.println("enter a slip1");
		int slip1=s.nextInt();
		  System.out.println("enter a slip2");
	  int slip2=s.nextInt();
	   int i=0,sum=0,sum1=0,count=0,count1=0;
	  
	while(sum>=totheight)
	{
		int slip=(slip1*100)/height1;
		height1=height1-(height1*slip);
	  sum=sum+height1;
		count++;
  }
	  while(sum1>=totheight)
	{
		int slip3=(slip2*100)/height2;
		height2=height2-(height2*slip3);
	  sum1=sum1+height2;
		  count1++;
  }
	System.out.println(count); 
	  System.out.println(count1); 
	  
	}

}
