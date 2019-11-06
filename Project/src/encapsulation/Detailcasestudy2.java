package encapsulation;

import java.util.Scanner;

public class Detailcasestudy2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Customer st=new Customer();
		
		Display2 st1=new Display2();
		
		System.out.println("REGISTRATION");
		System.out.println("enter the  name");
		boolean a =st.setName(s.next());
		System.out.println("enter the  address");
		boolean b= st.setAddress(s.next());
		System.out.println("enter the  contact number");
		boolean c=st.setContactNumber(s.next());
		System.out.println("enter the  email");
		boolean d=st.setEmail(s.next());
		System.out.println("enter the  prooftype");
		boolean e =st.setProofType(s.next());
		System.out.println("enter the  proof id");
		boolean f=st.setProofID(s.next());
		st1.view(st.getName(),st.getAddress(),st.getContactNumber(),st.getEmail(),st.getProofType(),st.getProofID());
	st1.check(a,b,c,d,e,f);

	}

}
