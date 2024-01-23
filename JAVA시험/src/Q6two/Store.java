package Q6two;

public abstract class Store {
	
	private String name;
	private String event;
	private double price;
	
	public abstract double grade();

	
	
	
	
	
	public Store(String name, String event, double price) {
		
		this.name = name;
		this.event = event;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
