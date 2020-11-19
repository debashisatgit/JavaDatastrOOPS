package OopsConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		//fst we can not create the obj of the interface
		//Usbank b = new Usbank();
		
		System.out.println(UsBank.min_bal);  //we can access the the staticmethos by giving reference of the interface name
		
		HsbcBank hs = new HsbcBank();  //can create the obj of child 
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.EducationLoan();
		hs.CarLoan();
		
		//dynamic polumerfisim
		//clild class obj can be refer by parent interface reference variable
		
		UsBank b = new HsbcBank();  //this is allowed
		b.credit();
		b.debit();
		b.transfermoney();
		//b.carloan();          //we can not access child methods only and only parent and child class common method we can access
		
		
		
		
		
		
		
		


	}

}
