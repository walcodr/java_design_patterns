package main.java.com.creational.factorypattern;

public class DomesticPlan extends Plan{
	// this class extends abstract class Plan
	
	@Override
	public void getRate() {
		// the abstract class's method get overridden here for
		// customization in the concrete class
		rate = 3.50;
		
		
	}

}
