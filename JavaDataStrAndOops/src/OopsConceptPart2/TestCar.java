package OopsConceptPart2;

public class TestCar {

	public static void main(String[] args) {
	
		//compile time polymorfisem
		BMW b = new BMW();     //creating obj of child class
		b.start();   //here it will check both the class if method r same in both it will giv priyority to child class or overriden method
		b.stop();
		b.safty();
		b.refule();
		b.engine();
		
		System.out.println("**************************************");
		
		Car c = new Car();    //creating obj of parent class
		c.start();
		c.stop();
		c.refule();
		c.engine();
		//c.safty we can access bcz its a child class property
		
		System.out.println("**************************************");
		//Also called Top casting
		Car c1 = new BMW();//child class obj can be refer by parent class reference variable = dynamic polymerfisim
		c1.start();
		c1.stop();
		c1.refule();
		c1.engine();
		//c1.safty  - can not access it bcz of child class property
		
		
		//down casting
		//BMW b1 = new Car(); parent class obj can be called by child class reference variable not allowed
		//BMW b1 = (BMW)new Car();   //this is allowed need to cast the parent obj with child name in brackets, 
		                                     //but while running it it will throw class cast exception at compile time it will tack
		                                     //Car cannot be cast to class OopsConceptPart2.BMW
	}

}
