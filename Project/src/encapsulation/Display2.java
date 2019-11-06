package encapsulation;

public class Display2 {

	public void view(String name, String address, String contactNumber, String email, String proofType,
			String proofID) {
		//if(name && address && contactNumber && email && proofType && proofID)


		System.out.println(" NAME: "+name);
		System.out.println(" ADDRESS  : "+address);
		System.out.println(" NUMBER  : "+contactNumber);
		System.out.println(" EMAIL  : "+email);
	System.out.println(" TYPE  : "+proofType);
	System.out.println(" PROOF ID  : "+proofID);
	
		
		
		
	}

	public void check(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
		// TODO Auto-generated method stub
		
		if(!a||!b||!c||!d||!e||!f)
		{
			if(!a)
			{
				System.out.println("Invalid name");
			}
		
			
			if(!b)
			{
				System.out.println("Invalid address");
			}
			
			if(!c)
			{
				System.out.println("Invalid contact number");
			}
			if(!d)
			{
				System.out.println("Invalid email");
			}
			if(!e)
			{
				System.out.println("Invalid prooftype");
			}
			if(!f)
			{
				System.out.println("Invalid proofid");
			}
			System.out.println("Registration Failed");
		}
		
		else
		{
			System.out.println("Registration successful");
			//if(a&& b&& c&& d&& e&&f)
			//{
			//	view(getname(),getAddress(),getContactNumber(),getEmail(),getProofType(),getProofID());
			//}
			System.out.println("Thank you for registering.Your id is 1");
		}
		

}

	private String getProofID() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getProofType() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getContactNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getname() {
		// TODO Auto-generated method stub
		return null;
	}
}
