
public class Customer {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	static int register;
	public Customer(String name,String address, String contactNumber, String email, String proofType, String proofID){
	   
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.email = email;
		this.proofType = proofType;
		this.proofID = proofID;
	}
	public void register(String name,String address, String contactNumber, String email, String proofType,
			String proofID) { 
		System.out.println("Your details are");
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.contactNumber);
		System.out.println(this.email);
		System.out.println(this.proofType);
		System.out.println(this.proofID);
		System.out.println(++register);
		
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getAddress() {
		return address;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	private String getContactNumber() {
		return contactNumber;
	}
	private void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private String getProofType() {
		return proofType;
	}
	private void setProofType(String proofType) {
		this.proofType = proofType;
	}
	private String getProofID() {
		return proofID;
	}
	private void setProofID(String proofID) {
		this.proofID = proofID;
	}
	
}