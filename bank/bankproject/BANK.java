package bankproject;
import java.time.LocalDate;
import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class BANK {
	double balance;
	String name;
	int id;
	
	public BANK(String name, double balance) {
	this.name=name;
	this.balance = balance;
	this.id =createId();
	balance=0;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int createId() {
		Random random = new Random();
		int n1 = random.nextInt();
		int n2 = random.nextInt();
		int n3 = random.nextInt();
		int id = (100 * n1) + (10 * n2) + n3;
		return id;
	}
	
	public int getId() {
		return this.id;
	}
	
	//deposit method
	public void deposit(double amount) {
		if(amount <= 0) {
			 System.out.println("Invalid amount. Amount must be greater than zero.");
			 System.out.println();
		}
		balance += amount;
		System.out.println("Deposite process completed.");
		System.out.println(name+" has "+balance);
		System.out.println();
	}
	
	//withdraw method
	public void withdraw (double amount) {
		if(amount<= balance && balance != 0) {
		balance -= amount;
		System.out.println(name+" withdrawed "+ amount);
		System.out.println("withdraw completed");
		System.out.println();
		}
		else {
			System.out.println("Balance error.");
			System.out.println();
		}
	}
	
	//transfer method 
	public void transfer(double amount, BANK account) {
		//check whether the transfer is allowed
		if(this.balance < amount) {
			System.out.println("Not enough balance.");	
			System.out.println();
		}
		else {
			this.balance -= amount;
			account.balance += amount;
			System.out.println("transfer succeed");
			System.out.println(name+" now has "+balance);
			System.out.println(account.name+" now has "+account.balance);
	}}
	//date method
	public void getDate() {
		LocalDate today = LocalDate.now();
		LocalTime time = LocalTime.now();


		DateTimeFormatter mydate = DateTimeFormatter.ofPattern("E,dd MMM YYY");
		DateTimeFormatter mytime = DateTimeFormatter.ofPattern("HH mm SS");


		String date = today.format(mydate);
		String day =time.format(mytime);


		System.out.println("done in " + date);
		System.out.print("in"+ day);
	
}

}
