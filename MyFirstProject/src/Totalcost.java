import java.util.Scanner;


public class Totalcost {

public static void main(String [] args){

	 Scanner in1 = new Scanner(System.in);

	 int item;
	 String str1;
	 double totalcost;
	 
    System.out.println("Enter a item");
     item = in1.nextInt();

     System.out.println("Enter a type");
     str1 = in1.next();
     
  if(str1.equals("Neccessary"))
 {
	 totalcost=item*1/100;
     System.out.println("Total Cost "+ totalcost);

			 
 }
   else if(str1
		   .equals("Luxury"))
   {
	   totalcost=item*7/100;
	     System.out.println("Total Cost "+ totalcost);

	   
   }
}
}


