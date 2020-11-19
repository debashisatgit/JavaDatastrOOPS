package OopsConceptPart1;

public class CallByValueAndReference {
	
	int p;      //non static global var
	int q;      //non static global var

	public static void main(String[] args) {
	
		//By using class obj reference we can call the c
		
		CallByValueAndReference obj = new CallByValueAndReference();
		
		int x = 10;
		int y = 15;
		obj.testsum(x, y);    //here we have given value to x and y ,in testsum method the value of a and b will be x,y. call by value 
		obj.p = 9;
		obj.q = 6;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	
	}
	
	public int testsum(int a , int b)
	{
		a = 30;
		b = 40;
		int c = a+b;
		return c;
	}
	
	//call by reference	
	public void swap(CallByValueAndReference t)          // giving the reference of class 
	{
		int temp;
		temp = t.p; //temp  50
		t.p = t.q; //now t.p = 60
		t.q = temp; //t.q = 50
		
	}
	

}
