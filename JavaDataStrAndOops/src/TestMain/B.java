package TestMain;

public class B {

	public static void main(String[] args) {
		System.out.println("B class main method");
		
		//A.main(args); // calling A class main method from B
		//it will run infinite time bcz control will go to B to A then again A to B
		

	}

}
