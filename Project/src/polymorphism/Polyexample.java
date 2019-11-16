package polymorphism;

import java.util.Scanner;

public class Polyexample {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter 3 nos");
	Add a=new Add();
	int n1=s.nextInt();
	int n2=s.nextInt();

	int n3=s.nextInt();
	a.add(n1);
	a.add(n1,n2);
	a.add(n1,n2,n3);


	}

}
class Add
{

	public void add(int n1) {
		System.out.println("print the Ist number"+n1);
		
	}

	public void add(int n1, int n2, int n3) {
		System.out.println("print the 3rd number"+(n1+n3+n2));
		// TODO Auto-generated method stub
		
	}

	public void add(int n1, int n2) {
		System.out.println("print the 2Nd number"+(n1+n2));
		
	}
	
}
