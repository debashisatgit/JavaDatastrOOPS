package OopsConceptPart2;

public interface UsBank {
	
	int min_bal = 100;  //static and final in nature can not change the value in the test class
	
	public void credit();     
	                          
	public void debit();     
	                          
	public void transfermoney(); 
	
	//only method declarition  ,no method body
	//in interface we can declare variables, and variables are static in nature
	//can not cahange variable value
	//no static method are allowed in interface bcz interface are part of obj and we can not write ststic met in interface
	//no main method , interface are abstract in nature,can not create obj of interface

}
