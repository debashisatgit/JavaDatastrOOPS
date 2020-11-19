package Abstraction;

public class BMW implements Car{

	@Override
	public void start() {
		System.out.println("BMW====start");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW====stop");
		
	}

	@Override
	public void refule() {
		System.out.println("BMW====refule");
		
	}
	
	//NON overwridden method of BMW
	
	public void safty() {
		System.out.println("BMW---==---safty");
	}
	
	/*public void start() {
		System.out.println("BMW====start");
	}
	
	public void stop() {
		System.out.println("BMW====stop");
	}
	
	public void refule() {
		System.out.println("BMW====refule");
	}*/
	

}
