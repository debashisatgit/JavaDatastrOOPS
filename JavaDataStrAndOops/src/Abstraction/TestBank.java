package Abstraction;

public class TestBank {

	public static void main(String[] args) {
		
		//child class obj
		
		HdfcBank hb = new HdfcBank();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();  //own click class method
		
		//dynamic polymerfisem
		
		Bank b = new HdfcBank();
		b.credit();
		b.credit();
		b.loan();
		//b.funds    can not call the child class proporty by parent class reference variable
		
		//Bank b1 = new Bank(); can not create the obj of a abstract class as well as of a interface
	    // bcz interface is 100 % abstract in nature and abstraction class is parsial in abstraction in nature
		
		
	}

}
