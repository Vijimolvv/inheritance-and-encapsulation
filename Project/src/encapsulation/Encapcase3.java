package encapsulation;

import java.util.Scanner;

public class Encapcase3 {

	public static void main(String[] args) {


		
		Scanner s=new Scanner(System.in);
		int a,i=1,k=1;
		 Casestudy34 Casestudy34 = new Casestudy34();

		System.out.println("enter price of ticket");
		Casestudy3 c;
		c.setPrice(s.nextInt());
		System.out.println("enter no of person");
		c.setP(s.nextInt());
		a=c.getP();
		do {
		System.out.printf("ENTER DETAILS OF P%d\n",i);i++;
		System.out.println("enter name");
		c.setName(s.next());
		System.out.println("enter gender(F/M)");
		c.setG(s.next());
		System.out.println("enter age");
		c.setAge(s.nextInt());
		a--;
		}while(a>0);
		c.ticket(c.getP(),c.getPrice());
		while(k<=c.getP())
		{

		double total=c.ticket1(c.getAge(),c.getG(),c.getP(),c.getPrice());

		if(k==c.getP()) {

		System.out.printf("TOTAL AMOUNT=%.1f",total);
		break;
		}
		k++;
		}
		}

		}
		
		
	