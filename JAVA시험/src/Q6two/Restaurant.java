package Q6two;

public abstract class Restaurant extends Store {
	public double service;
	public double flavor;
	public double clean;
	
	
	
	public Restaurant(String name, String event, double price, double service, double flavor, double clean) {
		super(name, event, price);
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}
	
	
	

	public abstract double grade();

}
