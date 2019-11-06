package tutorial;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int i,count=0;
		for(i=2;i<num/2;i++)
		{
			if (num%i==0)
			{
				count++;
			break;
		}}
		if(count==0)
		{
System.out.println("Prime number");
		}
else
	System.out.println("Not a Prime number");
	

	}

}
