package JavaBasicsN;

public class DataTypes {

	public static void main(String[] args) {
	
		// Data Types
		// Prmative Data Types = int , double , char , boolean
		
		//1. int:
		int i = 10;                 // int is the data type , i is the variable , 10 is the value
		//int i = 20;  // duplicate is not allowed or with same variable name java will not allow to store value
		int j = 20;
		System.out.println(j);
		int k = -3;
		int m = 0;
		System.out.println(i+j);
		
		//2.double:
		double d = 5.44;
		double d1 = 5.55;
		System.out.println(d1);
		double d3 = 100; // can store int in double but can not double in int
		System.out.println(d+d3);
		
		//3.char:
		char c = 'a';      //char always should be written within single quotes and it should be a single digit vale 
		char c1 = 'A';
		char c2 = '1';
		System.out.println(c2);
		char c3 = '$';
		
		//4.boolean:
		boolean b1 = true; //boolean can be only true or flase or else 0 or 1 , it will not store any other value
		System.out.println(b1);
		boolean b2 = false;
		
		//5.string:            //string is a class not a data type but can be used as a data type
		String s = "Hi";       //string always start with upperclass and in double quotes
		String s1 = "1000";    // it will tack the value as string bcz of double quotes
		System.out.println(s1);
		String s2 = "5.55";
		String s3 = "@$$$$";
		
		
	
		
		

	}

}
