package encapsulation;

public class Guest {
	String name;
	String address;
	 String contactNumber ;
	String email;
	String proofType;
	String proofID;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofID() {
		return proofID;
	}
	public void setProofID(String proofID) {
		this.proofID = proofID;
	}
	//public void display()
	//{
	//	System.out.println(" NAME: "+name);
	//	System.out.println(" ADDRESS: "+address);
	//	System.out.println(" NUMBER: "+contactNumber);
	//	System.out.println(" EMAIL: "+email);
	//	System.out.println(" PROOF: "+proofType);
	//	System.out.println(" ID: "+proofID);

	//	
		
	//}
	
}
