import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Customer1 {
  String ac;
  String cot;
  String cable;
  String wifi;
  String laundry;
  int num = 0;
  String values;
  static int register;
  int cost;
  public  int i = 0,v=0,pass;
  //Scanner sc = new Scanner(System.in);
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  public Customer1(String ac, String cot, String cable, String wifi, String laundry) {
	  this.ac=ac;
	  this.cot=cot;
	  this.cable=cable;
	  this.wifi=wifi;
	  this.laundry=laundry;
  }
  public void Booking(String ac,String cot, String cable, String wifi, String laundry) throws IOException {
	
	  do {
if (ac=="AC")
{
	cost+=1000;
} 
else
{
	cost+=750;
}
if (cot=="Single")
{
	cost+=0;
}
else
{
	cost+=350;
}
if(cable=="C")
{
	cost+=50;
}
else
{
	cost+=0;
}
if(wifi=="w")
{
	cost+=200;
}
else
{
	cost+=0;
}
if(laundry=="L")
{
	cost+=100;
}
else
{
	cost+=0;
}
System.out.println("the total charge is Rs."+cost);
System.out.println("the services choosen are");
if (ac.equals("AC") && cot.equals("Single"))
{
	System.out.println("Single cot AC room");
}
else
{
	System.out.println("Double cot nAC room");
}
if(cable.equals("C"))
{
	System.out.println("Cable connection enabled");
}
else
{
	System.out.println("Cable connection not enabled");
}
if (wifi.equals("W"))
{
	System.out.println("Wi-Fi enabled");
}
else
{
	System.out.println("Wi-Fi not enabled");
}
if (laundry.equals("L"))
{
	System.out.println("with laundry service");
}
else
{
	System.out.println("without laundry service");
}
System.out.println("Thank you for booking. Your room number is "+ ++register);
System.out.println("--------------------------------------------");
  
  

System.out.println("Book another room");

values = br.readLine();
if(values == "yes")
{
	num = num + 1;
}
	  
}while(num!=0);
  }
public void  val() {
int a[] = new int [25];
if( register!= 0 )
{
	a[i] = register;
	v = register;
	i++;
}
  }	

}
