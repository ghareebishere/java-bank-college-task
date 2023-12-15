package bank;
import java.util.*;
public class Bank {
	private List<Customer> customers;
	private List<Account> accounts;
	
	public Bank() {
		this.customers = new ArrayList<>();
		this.accounts = new ArrayList<>();
	}
	public void addCustomer(Customer cutomer) {
		customers.add(cutomer);
	}
	public void removeCustomer(Customer customer) {
		customers.remove(customer);
	}
	public void openAccount(Customer customer, double balnce) {
		Account account = new Account(customer, balnce);
		accounts.add(account);
	}
	public void deposite(Account account, double amount) {
		
		account.setBalance(account.getBalance() + amount);
		 
	}
	public void withdraw(Account account, double amount) {
		account.setBalance(account.getBalance() - amount);
	}
	public void transfer(Account account1, Account account2, double amount) {
		account2.setBalance(account2.getBalance() + amount);
		account1.setBalance(account1.getBalance() - amount);
	}
}
