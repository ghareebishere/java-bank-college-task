package bankproject;

public class Program {

	public static void main(String[] args) {
	BANK saif=new BANK("saif", 100);
	
	saif.deposit(1000);

    BANK aymen=new BANK("aymen", 90);
    
    aymen.deposit(300);
    
    saif.transfer(500, aymen);
    saif.transfer(5000, aymen);
    aymen.withdraw(500);
    saif.getDate();
	}

}
