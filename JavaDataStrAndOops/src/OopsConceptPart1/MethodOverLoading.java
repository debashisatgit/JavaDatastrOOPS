package OopsConceptPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5); 
		
				
	}
	
	public static void main(int y) {   //main method can be over loaded with diff input paramater
		
	}
	
	//when the method name is same with diff argument or input parameter with in the same class is called method overloading 
	//NON STATIC METHODS : LOCAL Variables of sum
	
	public void sum() {
		System.out.println("sum method is printing with 0 input parameter");
	}
	//duplicate methods are not allowed 
	//can not create a method inside a method
	
	public void sum(int i) {
		System.out.println("sum method with  1 input parameter-method overloading");
		System.out.println(i);
	}
	
	public void sum(int l , int k) {
		System.out.println("sum method with  2 input parameter-method overloading");
		System.out.println(k+l);
	}

}
