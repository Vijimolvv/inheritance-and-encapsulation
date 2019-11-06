package encapsulation;

public class Customer {
	String name;
	String address;
	 String contactNumber ;
	String email;
	String proofType;
	String proofID;
	public String getname() {
		return name;
	}
	
	public boolean setName(String name)
    {
        if (name.matches("^[A-Z a-z]*$"))
        {
            this.name=name;
            return true;
        }
        else
        {
           // System.out.println("Invalid Letter");
            return false;
        }
    }
    public String getName()
    {
        return this.name;
    }
	
	
	
	
	//public void setName(String name) {
	//	this.name = name;
	
	public String getAddress() {
		return address;
	}
	
	public boolean setAddress(String address)
    {
        if (address.matches("^[0-9 A-Z a-z -]*$"))
        {
            this.address=address;
            return true;
        }
        else
        {
           // System.out.println("Invalid Address");
            return false;
        }
    }
    public String getaddress()
    {
        return this.address;
    }
	
	
	
	//public void setAddress(String address) {
		//this.address = address;
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	public boolean setContactNumber(String contactNumber)
    {
        if (contactNumber.matches("^[0-9]*$"))
        {
            this.contactNumber=contactNumber;
            return true;
        }
        else
        {
           // System.out.println("Invalid Contact Number");
            return false;
        }
    }
    public String getcontactNumber()
    {
        return this.contactNumber;
    }
	
	
	
	//public void setContactNumber(String contactNumber) {
	//	this.contactNumber = contactNumber;
	
	public String getEmail() {
		return email;
	}
	//public void setEmail(String email) {
		//this.email = email;
		
		public boolean setEmail(String email)
        {
            if (email.contains("@"))
            {
                this.email=email;
                return true;
            }
            else
            {
               // System.out.println("Invalid Email");
                return false;
            }
        }
        public String getemail()
        {
            return this.email;
        }

	
	public String getProofType() {
		return proofType;
	}
	
	public boolean setProofType(String prooftype)
    {
        if (prooftype.matches("^[A-Z a-z]*$"))
        {
            this.proofType=prooftype;
            return true;
        }
        else
        {
           // System.out.println("Invalid prooftype");
            return false;
        }
    }
    public String ProofType()
    {
        return this.proofType;
    }
	
	
	//public void setProofType(String proofType) {
		//this.proofType = proofType;
	//}
	public String getProofID() {
		return proofID;
	}
	
	
	
	
	
	public boolean setProofID(String proofID)
    {
        if (proofID.matches("^[0-9 A-Z a-z]*$"))
        {
            this.proofID=proofID;
            return true;
        }
        else
        {
           // System.out.println("Invalid proof");
            return false;
        }
    }
    public String getproofID()
    {
        return this.proofID;
    }
	
	
	
	
}
