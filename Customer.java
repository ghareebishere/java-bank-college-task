package bank;

public class Customer {
	private String name;
	private int customerId;
	
	public Customer(String name, int id) {
		this.name = name;
		this.customerId = id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return customerId;
	}
}
