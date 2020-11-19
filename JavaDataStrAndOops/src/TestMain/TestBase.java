package TestMain;

public class TestBase {    //method overloading

	public static void main(String[] args) {	//with method name 0 parameters array parameter
		System.out.println("main method 1");
		
		//so if u want to call the other method jsut pass the value inside the actual main method
		main("testing");
		main(10);
		main(15 ,20);
		
		
		
	}
	public static void main(String args) {	//with method name 1 parameters normal parameter
		System.out.println("main method 2");		
	}
	public static void main(int a) {		  //with same method name 1 parameters
		System.out.println("main method 3");		
	}
	public static void main(int a , int b) {  //with same method name 2 parameters		
		System.out.println("main method 4");		
	}
}
