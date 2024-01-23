package Q6two;

public abstract class Salon extends Store {
	
	private double technology;
	private double kidsess;
	
	public Salon(String name, String event, double price, double technology, double kidsess) {
		super(name, event, price);
		this.technology = technology;
		this.kidsess = kidsess;
	}
	
	public abstract double grade();
	
	
	

}
