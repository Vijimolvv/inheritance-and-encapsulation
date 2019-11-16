package interfacepgms;

import java.util.Scanner;

public class Interfacefreshgrad {

	public static void main(String[] args) {
		    Scanner s=new Scanner(System.in);
		    System.out.println("1.Current Account\n2.Savings Account");
		    int n=s.nextInt();
		    double maint=50.00,current=100.00,charge,charge1;
		    switch(n)
		    {
		      case 1:
		        System.out.println("Name");
		String name=s.next();
		System.out.println("Account Number");
		String acno=s.next();
		System.out.println("Account Balance");
		int bal=s.nextInt();
		        System.out.println("Enter the Start Date(yyyy-mm-dd)");
		int dat=s.nextInt();
		        System.out.println("Enter the Years");
		int year=s.nextInt();
		        charge1=maint*year;
		        System.out.printf("Maintainence Charge For current Account %d",charge1);
		 
		      case 2:
		        
		        System.out.println("Name");
		String name1=s.next();
		System.out.println("Account Number");
		String acno1=s.next();
		System.out.println("Account Balance");
		int bal1=s.nextInt();
		        System.out.println("Enter the Start Date(yyyy-mm-dd)");
		int dat1=s.nextInt();
		        System.out.println("Enter the Years");
		int year1=s.nextInt();
		        charge=maint*year1;
		        System.out.printf("Maintainence Charge For Savings Account %d",charge);
		        
		        
		    
		        
		   Account s1=new Account();
		   Savingsaccount s2=new  Savingsaccount();
		   Currentaccount1 s3=new Currentaccount1();
		    
		    s2.savingsac(name1,acno1,bal1,dat1,year1,charge);
		    s3.currentac(name,acno,bal,dat,year,charge1);
		    }
		  }
		}

interface  maintainanceCharge 
{
	public void currentac(String name,String acno,int bal,int dat,int year,double charge1);

	
}
interface  maintainanceCharge1 
{
	public void savingsac(String name1,String acno1,int bal1,int dat1,int year1,double charge);
}
 abstract class Account implements maintainanceCharge  ,maintainanceCharge1 {
	public void currentac(String name,String acno,int cno,int bal,int dat,int year,double charge1)

	{
	
		
		   System.out.println("Name"+name);
		   System.out.println("Account Number  : "+acno);
		   
		   System.out.println("Account Balance: "+bal);
		   System.out.println("Enter the Start Date(yyyy-mm-dd) : "+dat);
		   System.out.println("Enter the Years : "+year);
	       System.out.println("Maintainence Charge For Current Account"+charge1);
	
	}

	public void update(String name1,String acno1,int cno1,int bal1,int dat1,int year1,double charge)
	{
		 System.out.println("Name"+name1);
		   System.out.println("Account Number  : "+acno1);
		   
		   System.out.println("Account Balance: "+bal1);
		   System.out.println("Enter the Start Date(yyyy-mm-dd) : "+dat1);
		   System.out.println("Enter the Years : "+year1);
	       System.out.println("Maintainence Charge For Current Account"+charge);
		
	}
 }
	
		
		
