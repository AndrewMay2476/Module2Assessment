package model;

/**  
* @author Andrew May - agmay
* CIS175 - Fall 2023
* Sep 4, 2023
*/

public class RestaurantMenu {
	private String menuItem;
	private double price;
	private int calories;
	
	// default no-argument constructor
	public RestaurantMenu() {
		super();
	}
	
	// constructor that takes all properties as arguments
	public RestaurantMenu(String menuItem, double price, int calories) {
		this.menuItem = menuItem;
		this.price = price;
		this.calories = calories;
	}

	// menuItem getter
	public String getMenuItem() {
		return menuItem;
	}

	// menuItem setter
	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}

	// price getter
	public double getPrice() {
		return price;
	}

	// price setter
	public void setPrice(double price) {
		this.price = price;
	}

	// calories getter
	public int getCalories() {
		return calories;
	}

	// calories setter
	public void setCalories(int calories) {
		this.calories = calories;
	}

}
