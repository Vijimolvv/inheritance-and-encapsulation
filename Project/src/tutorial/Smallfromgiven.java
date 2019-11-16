package tutorial;

import java.util.Scanner;

public class Smallfromgiven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a size");
	      int n = s.nextInt();
	      int a[] = new int[n];
	      int i,j,small=0;
	      System.out.println("elements are");
	      for(i=0;i<n;i++)
	      {
	     a[i] = s.nextInt();
	      small = a[0];
	      if(small>a[i])
	      {
	      small = a[i];
	      }
	     
	      }
	      System.out.println(small);
	      }
	}

