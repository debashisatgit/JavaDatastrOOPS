package TestMain;

public class A {

	public static void main(String[] args) {
		System.out.println("A class main method");
		
		// if we want to call the B class main method we can call it by class name bcz it is publically defined and static in nature
		B.main(args);    //calling B class 
		
	
	}

}
