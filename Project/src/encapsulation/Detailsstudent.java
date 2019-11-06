package encapsulation;

import java.util.Scanner;

public class Detailsstudent {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Studen1 st=new Studen1();
		System.out.println("enter the  name");
		st.setName(s.next());
		System.out.println("enter the  id");
		st.setId(s.next());
		System.out.println(" NAME: "+st.getName());
		System.out.println(" ID  : "+st.getId());

	}

}
