import static org.junit.Assert.*;

import org.junit.Test;


public class TotalcostTest {

	@Test
	public void test() {
		Totalcost TotalCost= new Totalcost();
   
        double item=100.00;
        double tax=0.07;
        double expected=100.07;
        double result=TotalCost.hashCode();
        assertEquals(expected,result,0.0001);
 
        //assertEquals (sum, total);;
      }
	}


