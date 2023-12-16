package bankproject;

public class Program {

	public static void main(String[] args) {
	BANK saif=new BANK("saif");
	
saif.deposite(1000);

    BANK aymen=new BANK("aymen");
    
aymen.deposite(300);

    saif.transfer(500, aymen);
    
    aymen.withdraw(500);
saif.getDate();
	}

}
