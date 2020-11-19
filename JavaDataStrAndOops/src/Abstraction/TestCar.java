package Abstraction;

public class TestCar {

	public static void main(String[] args) {
		
		// as we know we can not create the obj of interface ,we will cfeate obj of bmw
		
		BMW b = new BMW();
		b.start();  //overridden method in bmw
		b.stop();   //overridden method in bmw
		b.refule(); //overridden method in bmw
		b.safty();  //own mwtod of BMW class
		
		//dynamic polymerfisem
		
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refule();
		//c1.safty     //can not call the child class method with parent class reference variable
		
		
		
		

	}

}
