package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.RestaurantMenu;

/**  
* @author Andrew May - agmay
* CIS175 - Fall 2023
* Sep 5, 2023
*/

public class RestaurantMenuTest {
	RestaurantMenu meal1 = new RestaurantMenu("Pizza", 11.95, 640);
	RestaurantMenu meal2 = new RestaurantMenu("Buffalo Wings", 8.95, 455);
	RestaurantMenu meal3 = new RestaurantMenu("Breadsticks", 5.99, 349);
	RestaurantMenu meal4 = new RestaurantMenu();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetMenuItem() {
		assertEquals(meal1.getMenuItem(), "Pizza");
	}
	
	@Test
	public void testSetMenuItem() {
		meal3.setMenuItem("Toasted Ravioli");
		assertTrue(meal3.getMenuItem() == "Toasted Ravioli");
	}
	
	@Test
	public void testGetCalories() {
		assertFalse(meal2.getCalories() > 500);
	}
	
	@Test
	public void testSetCalories() {
		meal4.setCalories(290);
		assertNotEquals(meal4.getCalories(), 0);
	}
	
	@Test
	public void testGetPrice() {
		assertNotNull(meal4.getPrice());
	}
	
	@Test
	public void testSetPrice() {
		meal2.setPrice(9.95);
		assertEquals(meal2.getPrice(), 9.95, 0);
	}
	
}
