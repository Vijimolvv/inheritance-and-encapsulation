package encapsulation;

import java.util.Scanner;

public class Dtlcase {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		Customernew st = new Customernew();
		    //Display2 st1 = new Display2();
		    System.out.println("Registration");
		    System.out.println("Enter your name");
		    boolean a=st.setName(s.next());
		    System.out.println("Enter your address");
		   boolean b= st.setAddress(s.next());
		    System.out.println("Contact Number");
		    boolean c=st.setContactNumber(s.next());
		    System.out.println("E-Mail ID");
		  boolean d=  st.setEmail(s.next());
		    System.out.println("Enter proof type");
		   boolean e= st.setProofType(s.next());
		    System.out.println("Enter proof id");
		    boolean f= st.setProofID(s.next());
		   
		    st.check(a,b,c,d,e,f);
		    //st.display();
		   
		}




		}

