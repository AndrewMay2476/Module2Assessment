package model;

/**  
* @author Andrew May - agmay
* CIS175 - Fall 2023
* Sep 5, 2023
*/

public class BillCalculation {
	static final double TAX = 0.07;
	static final double TIP = 0.20;
	private double subTotal = 0.00;
	private double total = 0.00;
	
	public BillCalculation() {
		super();
	}
	
	public double getSubTotal() {
		return subTotal;
	}
	
	public void updateSubTotal(double inItem) {
		this.subTotal += inItem; 
	}
	
	public void deductSubTotal(double inItem) {
		this.subTotal -= inItem;
	}
	
	public double getTotal() {
		return Math.round(this.total * 100) / 100;
	}
	
	public void setTotal() {
		this.total = this.subTotal + (this.subTotal * TAX) 
				+ (this.subTotal * TIP);
	}

}
