package OopsConceptPart2;

public class HsbcBank implements UsBank , BrazilBank{   //if any class implements an interface then it is mandatory to define the overridden method of the interface
	                                                   //and also can implement multiple interface which inheritence can't
	                                                  //is called is - a relationship interface, inheritence called has - a relationship
	public void credit() {                           //here we have to define the overrideen method with body
		System.out.println("HSBC******credit");
	}
	
	public void debit() {                         //here we have to define the overrideen method with body
		System.out.println("HSBC******debit");
	}
	
	public void transfermoney() {             //here we have to define the overrideen method with body
		System.out.println("HSBC******transfermoney");
	}
	
	public void CarLoan() {                 //own method
		System.out.println("HSBC==========CarLoan");
	}
	
	public void EducationLoan() {        //own method
		System.out.println("HSBC==========EducationLoan");
	}
	
	public void MutualFuds() {        //here we have to define the overrideen method with body
		System.out.println("HSBC@@@@@@@@@@@@MutualFuds");
	}
	
	
	

}
