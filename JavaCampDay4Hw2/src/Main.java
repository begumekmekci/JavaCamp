import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
	        customerManager.save(new Customer("Saadet Beg�m","Ekmek�i", new Date(), "1578564"));
	}
	}


