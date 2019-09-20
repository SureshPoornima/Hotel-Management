
import java.io.IOException;
import java.util.Scanner;

public class Menu {
	int value;
	int fin;
	int result;
	
     Scanner br = new Scanner(System.in);
  // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void menu() throws IOException
	{
		Customer1 s = new Customer1(null, null, null, null, null);
		s.val();
		do {
		System.out.println("1.Book");
		System.out.println("2.Check Status");
		System.out.println("3.Exit");
		System.out.println("Enter your choice");
		value = br.nextInt();
		switch(value) {
		case  1:
			System.out.println("Booking");
			
			break;
		case  2:
			System.out.println("Check Status");
			System.out.println("Enter room number");
			fin = br.nextInt();
			break;
		case  3:
			System.out.println("Exit");
		}
			if(fin == s.v)
			{
				System.out.print("Room number "+ fin);
				System.out.println(" is booked.");
				System.out.println("1.Book");
				System.out.println("2.Check Status");
				System.out.println("3.Exit");
				System.out.println("Enter your choice");
				
			}
			else
			{
				result= s.v;
				System.out.print("Room number "+ fin);
				System.out.println(" is not booked");
				System.out.println("--------------------------------------------");
				
				
			}
		}while( value> 0);
				
	}
}
		

