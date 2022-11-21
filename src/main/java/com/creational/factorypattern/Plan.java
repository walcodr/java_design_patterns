package main.java.com.creational.factorypattern;

abstract class Plan {
	
	protected double rate;
	
	abstract void getRate();
	
	
	
	public void calculateBill(int units) {
		System.out.println(units*rate);
		
	}

}
