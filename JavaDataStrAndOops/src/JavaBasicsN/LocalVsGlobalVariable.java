package JavaBasicsN;

public class LocalVsGlobalVariable {

	//Global Variable - immedeality after the class declare the variable 
	
	String name = "Adharana";
	int age = 28;
	
	public static void main(String[] args) {
		
		int i = 10;       //local variable for main method
		System.out.println(i);
		//want to access the global var then hav to create the obj of the class
		
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		
	}
	public void sum() {
		int i = 15; //this i is the local var for sum method
		int j = 20;
	}

}
