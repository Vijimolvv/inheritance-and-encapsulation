package polymorphism;

public class Telephonebill extends Bill {

	public void Bill(int tno, String cname, int nc, double costc) {
		// TODO Auto-generated method stub
		System.out.println("Bill Number:" +tno);
		System.out.println("Customer Name:" +cname);
		double x = nc*costc;
		System.out.println("Current Bill Amount :" +x);	
		
	}

}
