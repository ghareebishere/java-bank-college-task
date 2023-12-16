package bankproject;

public class Program {

	public static void main(String[] args) {
		//first bank
		BANK saif=new BANK("saif", 100);
		System.out.println("Saif Id: " + saif.getId());
		saif.deposit(1000);
		saif.deposit(-100);	
		saif.withdraw(300);
		saif.withdraw(5000);
		saif.getBalance();
	
		// second bank
	    BANK aymen=new BANK("aymen", 200);
	    System.out.println("Aymen Id: " + aymen.getId());
	    aymen.deposit(300);
	    aymen.withdraw(100);
	    aymen.getBalance();
    
	    //valid transfer
	    saif.transfer(500, aymen);
	    //invalid transfer
	    saif.transfer(5000, aymen);
	    
	    saif.History();
	    aymen.History();
	}

}
