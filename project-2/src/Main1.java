import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {



	public static void main(String[] args) throws IOException {
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		String proceed;
		String value = null;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name");
		name = br.readLine();
		System.out.println("Enter your Address");
		address = br.readLine();
		System.out.println("Enter your Contact number ");
		contactNumber = br.readLine();
		System.out.println("Enter your email");
		email  = br.readLine();
		System.out.println("Enter your Proof Type");
		proofType = br.readLine();
		System.out.println("Enter your Proof ID");
		proofID = br.readLine();
	   
		
	Customer c= new Customer(name,address,contactNumber,email,proofType,proofID);
	c.register(name,address,contactNumber,email,proofType,proofID);
	 System.out.println("Booking");
	  System.out.print("please choose the service required: ");
	  System.out.println("AC/non-AC(AC/nAC)");
	  ac = br.readLine();
	  System.out.println("Cot(Single/Double)");
	  cot = br.readLine();
	  System.out.println("With cable connection/without cable connection(C/nC)");
	  cable = br.readLine();
	  System.out.println("Wi-Fi needed or not(W/nW)");
	  wifi =br.readLine();
	  System.out.println("Laundry service needed or not(L/nL)");
	  laundry = br.readLine();
	  System.out.println("Do you want to proceed?(yes/no)");
	  proceed = br.readLine();
	  System.out.println("--------------------------------------------");
	Customer1 b = new Customer1(ac,cot,cable,wifi,laundry);
    b.Booking(ac,cot,cable,wifi,laundry);
      System.out.println("Menu");
      Menu m = new Menu();
      m.menu();
      
}
}
	
