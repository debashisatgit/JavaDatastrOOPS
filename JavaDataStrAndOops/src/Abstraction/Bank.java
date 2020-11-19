package Abstraction;

public abstract class Bank {
	
	//parsial abstraction
	//hiding the implementation logic is known as abstruction
	//abstract class can have abs method as well as non abs method
	
	int amo = 100;               //variable we can declare
	final int rate = 10;        //final we can declare
	static int loanrate = 5 ;  //static we can declare
	
	public abstract void loan();   //this is a abstract method(no method body)
	
	public void credit() {        //non abstract method bcz no use of abstart in the method, can use both abstract and non abstract 
		System.out.println("Bank------credit");
	}
	
	public void debit() {       //non abstract method with their method body
		System.out.println("Bank------debit");
	}
	
	
	
	
	
	

}
