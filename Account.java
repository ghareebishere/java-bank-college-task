package bank;
import java.util.*;
public class Account {
	private int accountId;
	private Customer Cutomer;
	private double balance;
	
	public Account(Customer Customer, double balance) {
		this.accountId = createId();
		this.Cutomer = Customer;
		this.balance = balance;
	}
	public int getAccountId() {
		return accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double value) {
		balance += value;
	}
	
	public int createId() {
		Random random = new Random();
		int n1 = random.nextInt();
		int n2 = random.nextInt();
		int n3 = random.nextInt();
		int id = (100 * n1) + (10 * n2) + n3;
		return id;
	}
}
