package JavaBasicsN;

public class StringCon {

	public static void main(String[] args) {
		//'+' is the symbol of concatenation operation
		
		int a = 100;
		int b = 9;
		
		String s = "java";
		String s1 = "code";
		
		double d = 10.5;
		double d1 = .5;
		
		System.out.println(d+d1);
		
		System.out.println(a+b);
		System.out.println(s+s1);
		
		System.out.println(a+b+s+s1);
		System.out.println(s+s1+(a+b));
		System.out.println(a+b+s+s1+(d+d1));
		System.out.println(a+b+(d+d1)+s+s1);
		System.out.println("javacorerun");    //with double quotes what ever is there it will print it
		System.out.println(s1);               //without double quotes it will print the vale assign to the variable
		System.out.println("the value of a is " + a);  // with this it will concatenate 
		System.out.println("the addison of a and b is " + (a+b)); // println means line new
		
		
		
		
		
		
		
		
	}

}
