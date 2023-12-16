package bankproject;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class BANK {
	double balance;
	String name;
	
	public BANK(String name) {
	this.name=name;
	balance=0;
	}
	
	//deposite method
	public void deposite(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid amount.");
		}
		balance+=amount;
		System.out.println(name+" has "+balance);
		System.out.println("Deposite completed");
	}
	//withdraw method
	public void withdraw (double amount) {
		if(amount<= balance && balance != 0) {
		balance-=amount;
		System.out.println(name+" withdrawed "+ amount);
		System.out.println("withdraw completed");
		}
		else {
			System.out.println("can not operate");
		}
	}
	//transfer method
	//create reference variable called account 
	public void transfer( double amount, BANK account) {
		//check whether the transfer is allowed
		if(balance<amount) {
			System.out.println("Not enough balance.");	
		}
		else {
			balance-=amount;
			account.balance+=amount;
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
