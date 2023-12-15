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
balance+=amount;
System.out.println(name+" has "+balance);
System.out.println("deposite completed");
}
//withdraw method
public void withdraw (double amount) {
	if(amount<= balance) {
	balance-=amount;
	System.out.println(name+" withdrawed "+ balance);
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
	System.out.println("eror");	
	}
	else {
		balance-=amount;
		account.balance+=amount;
	System.out.println(name+" now has "+balance);
	System.out.println(account.name+" now has "+account.balance);
	System.out.println("transfer succeed");
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
