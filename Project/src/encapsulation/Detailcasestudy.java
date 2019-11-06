package encapsulation;

import java.util.Scanner;

public class Detailcasestudy {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Guest st=new Guest();
		Display st1=new Display();
		System.out.println("REGISTRATION");
		System.out.println("enter the  name");
		st.setName(s.next());
		System.out.println("enter the  address");
		st.setAddress(s.next());
		System.out.println("enter the  contact number");
		st.setContactNumber(s.next());
		System.out.println("enter the  email");
		st.setEmail(s.next());
		System.out.println("enter the  prooftype");
		st.setProofType(s.next());
		System.out.println("enter the  proof id");
		st.setProofID(s.next());
		st1.display(st.getName(),st.getAddress(),st.getContactNumber(),st.getEmail(),st.getProofType(),st.getProofID());
	//	
		

	}

}
