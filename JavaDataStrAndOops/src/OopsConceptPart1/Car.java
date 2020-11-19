package OopsConceptPart1;

public class Car {
  
	//Global variable or class variables
    //Class and Object
	
	int mod;
	int wheel;
	

	public static void main(String[] args) {
		
	//creating obj of the car class
    //a,b,c are obj reference variable
	//new car is the obj
		
	//	  reference var         obj
		      Car a     =      new Car();         //2 variable will be given to each one"mod" "wheel"
		      Car b     =      new Car();        //2 variable will be given to each one"mod" "wheel"
		      Car c     =      new Car();        //2 variable will be given to each one"mod" "wheel"
		a.mod = 2019;
		a.wheel = 4;
		
		b.mod = 2018;
		b.wheel = 4;
		
		c.mod = 2017;
		c.wheel = 4;
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println("**************");
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println("**************");
		System.out.println(c.mod);
		System.out.println(c.wheel);
		System.out.println("**************");
		
		 
		
		
	}

}
