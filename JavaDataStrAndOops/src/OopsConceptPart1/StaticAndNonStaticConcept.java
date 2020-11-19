package OopsConceptPart1;

public class StaticAndNonStaticConcept {
	
	String name = "Adharana"; //non static global var
	static int age = 28;      //static global var

	public static void main(String[] args) {
		
		
		//how to call ststic  variables
		//1.direct calling
		sum();
		//2.calling by class name
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);		
		
		//how to call non static variables
		//create the obj of class name
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendmail();
		//obj.name(); can not access bcz it is non static 
		System.out.println(obj.name);
		//can we access static method with obj reference - yes but not preferable bcz can call directly or class name
		obj.sum(); //yellow line warning bcz it is free in the memory why to call it through object
		
		
	}

	public void sendmail() {  //non ststic method
		System.out.println("Mail sent frm gmail");
	}
	
	public static void sum() { //static method
		System.out.println("sum method");
	}
	
	
}
