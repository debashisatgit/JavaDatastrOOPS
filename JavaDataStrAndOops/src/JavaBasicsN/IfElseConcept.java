package JavaBasicsN;

public class IfElseConcept {

	public static void main(String[] args) {
		
		//Comparison operator 
	
		int a = 40;
		int b = 20;
		
		if(b>a) {        // inside if condition we all ways write boolean true or false
			System.out.println("b is greater then a");
		}
		else {
			System.out.println("a is greater then b");
		}
		System.out.println("*********************************************");
		
		int c = 10;
		int d = 10;
		
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		System.out.println("*********************************************");
		
		                                      //Find highest number
		int a1 = 3;
		int b1 = 60;
		int c1 = 9;
		//1. by nested if else condition
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is the greatest");
		}
		else if (b1>c1) {
			System.out.println("b1 is the greatest");
		}
		else {
			System.out.println("c1 is the greatest");
		}
		System.out.println("*********************************************");
		
		
		
		
	}

}
