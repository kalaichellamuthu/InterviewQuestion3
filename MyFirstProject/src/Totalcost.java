
import java.util.Scanner;


public class Totalcost {

public static void main (String [] args){
	
	 Scanner in = new Scanner(System.in);

	 double itemprice;
	 String type;
	 double salestax;
	double totalcost;
	 double dollars;
	 
    System.out.println("Enter the item price in cents");
     itemprice = in.nextInt();

     System.out.println("Enter the item type (Luxury/Necessary)");
     type = in.next();
     
  if(type.equals("Neccessary"))
 {
	 salestax=itemprice*1/100; 
	 totalcost=salestax+itemprice;
     System.out.println("Total Cost "+ totalcost);
     dollars=totalcost/100;
     System.out.println("In Dollars "+ dollars);
			 
 }
   else if(type.equals("Luxury"))
   {
	   salestax=itemprice*9/100;
	     totalcost=(salestax+itemprice);
	     System.out.println("Total Cost "+ totalcost);
	     dollars=totalcost/100;
	     System.out.println("In Dollars "+ dollars);

	   
   }
}
}



