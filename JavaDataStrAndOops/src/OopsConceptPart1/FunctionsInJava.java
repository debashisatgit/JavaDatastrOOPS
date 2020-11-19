package OopsConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava(); //we can access the below method by creating the obj of the alass,below 4   method have been given this obj
		                                          
		
	     obj.test();
	     
	    int l = obj.java();
	    System.out.println(l);
	    
	    String s1 = obj.qa();
	    System.out.println(s1);

	   int d = obj.division(30, 10);
	   System.out.println(d);
	    
	    
	}
	
	//Non Static Method
	// void does not return anything
	public void test() {             //No input no output    //TOTAL 4 FUNCTIONS we can call it by creating the obj UP.
		System.out.println("test method");
	}
	
	//here instade of void we have to giv int bcz c i returning int value
	//return type is int
	public int java() {              //No input but some output
		System.out.println("java method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	//qa method is returning s and s is string need to write string qa
	//return type is string
	public String qa() {            //No input but some output
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}
	//return type is int
	public int division(int x , int y) {//pass 2 input parameters x and y
		System.out.println("division mehod");
		int d = x/y;
		return d;
	}
	
	
	

}
