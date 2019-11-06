package tutorial;
import java.util.Scanner;
public class Primerange {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
				System.out.println("enter the lower limit");
				int num1=s.nextInt();
				System.out.println("enter the upper limit");
				
				int num2=s.nextInt();
				int i,j,flag=0;
				System.out.println("prime number between"+num1+"and"+num2);
			//	int count=0;
				for(i=num1;i<=num2;i++)
				{
					for(j=2;j<i;j++)
						
					{
						if(i%j==0)
						{
							flag=0;
							break;
						}
						else
						{
							flag=1;
						
						}
						
					}
				if(flag==1)
				{
		System.out.println(i);
				}
		
			

			}

		}

		
}
		

