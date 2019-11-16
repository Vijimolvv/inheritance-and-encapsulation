package polymorphism;

import java.util.Scanner;

public class POlyprogramfre {

	
		class Calories
		{
		  public void main(String args[])
		  {
		   Scanner s=new Scanner (System.in);
		    System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter\nEnter the choice");
		    int n=s.nextInt();
		    switch (n)
		    {
		   
		    case 1:
		    System.out.println("Enter the number of Slice of bread");
		    int brd=s.nextInt();
		    fuji a=new fuji();
		    a.cal(brd);
		    break;
		    case 2:
		    System.out.println("Enter the number of Slice of bread");
		        int brd1=s.nextInt();
		        System.out.println("Enter the number of teaspoon of Jam");
		        int jam1=s.nextInt();
		        fuji a1=new fuji();
		       
		        a1.calo(brd1,jam1);
		        break;
		    case 3:
		    System.out.println("Enter the number of Slice of bread");
		        int brd2=s.nextInt();
		        System.out.println("Enter the number of teaspoon of Jam");
		        int jam2=s.nextInt();
		        System.out.println("Enter the number of teaspoon of Butter");
		        int butter2=s.nextInt();
		        fuji a2=new fuji();
		     
		        a2.calor(brd2,jam2,butter2);
		        break;
		    }
		  }
		}
		class fuji
		{
		double bk=0,jk=0,buk=0;
		int b=0,j=0,bu=0;

		  void cal(int brd)
		  {
		   b=brd*74;
		    bk=b*4.1868;
		    System.out.println(bk+" kJ of energy generated from"+b+" calories");
		 
		  }
		  public void calor(int brd2, int jam2, int butter2) {
		 b=brd2*74;
		   bk=b*4.1868;
		   j=jam2*26;
		   jk=j*4.1868;
		   bu=butter2*102;
		   buk=bu*4.1868;
		   System.out.println((bk+jk+buk)+" kJ of energy generated from"+(b+j+bu)+" calories");
		  }
		public void calo(int brd1, int jam1) {
		 b=brd1*74;
		   bk=b*4.1868;
		   j=jam1*26;
		   jk=j*4.1868;
		   System.out.println((bk+jk)+" kJ of energy generated from"+(b+j)+" calories");
		}


		 
		
}
}
