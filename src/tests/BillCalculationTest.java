package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BillCalculation;
import model.RestaurantMenu;

/**  
* @author Andrew May - agmay
* CIS175 - Fall 2023
* Sep 5, 2023
*/

public class BillCalculationTest {
	
	RestaurantMenu meal1 = new RestaurantMenu("Fried Chicken", 8.99, 425);
	RestaurantMenu meal2 = new RestaurantMenu("Jambalaya", 6.95, 379);
	RestaurantMenu meal3 = new RestaurantMenu("Seafood Gumbo", 10.99, 408);
	BillCalculation billCalc = new BillCalculation();
	
	@Before
	public void setUp() throws Exception {
	
	}

	@Test
	public void TestGetSubTotal() {
		billCalc.updateSubTotal(meal1.getPrice());
		billCalc.updateSubTotal(meal2.getPrice());
		billCalc.updateSubTotal(meal3.getPrice());
		assertTrue(billCalc.getSubTotal() == 26.93);
	}
	
	@Test
	public void TestDeductSubTotal() {
		billCalc.deductSubTotal(meal2.getPrice());
		assertFalse(billCalc.getSubTotal() == 26.93);
	}
	
	@Test
	public void TestSubTotalvTotal() {
		assertNotSame(billCalc.getSubTotal(), billCalc.getTotal());
	}
	
	@Test
	public void TestGetTotal() {
		billCalc.updateSubTotal(meal1.getPrice());
		billCalc.updateSubTotal(meal2.getPrice());
		billCalc.updateSubTotal(meal3.getPrice());
		billCalc.setTotal();
		assertEquals(billCalc.getTotal(), 34.00, 0.01);
	}
	
	
	
}
