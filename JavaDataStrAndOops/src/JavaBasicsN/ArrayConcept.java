package JavaBasicsN;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array: to store similar types of data types values in a array variable 
		//Advantage - In a single variable we can store multiple variables with similar DT
		//Disadvantage - size is fixed which is also called static array - to overcome this we use collections like array list,hash table
		//store only similar DT - but to overcome this problem we use Object array
		//1. int array
		//1D Array
		
		int i[] = new int[5];            //here int i is a array variable bcz of [] 
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;                      //like this we can declare values in a array variable
		System.out.println(i[4]);
		System.out.println(i[0]);
		System.out.println("***************************");
		//System.out.println(i[5]);     if we give a location if it is not found java will throw - array index out of bounds exception
		
		System.out.println(i.length);   // variable name.length method to print the size of array
		
		System.out.println("***************************");
		
		//to print all the values of the array have to use for loop concept
		
		for(int j =0;j<i.length;j++) {
			
			System.out.println(i[j]);
		}
		System.out.println("****************************");
		
		//2. double array
		
		double d[] = new double[2];
		d[0] = 9;
		d[1] = 8;
		System.out.println(d[0]);
		System.out.println(d[1]);
		
		System.out.println("****************************");
		
		System.out.println(d.length);
		
		System.out.println("*****************************");
		
		for(int e=0;e<d.length;e++) {
			
			System.out.println(d[e]);
		}
		
		System.out.println("*****************************");
		
		//3.String array
		
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "java";
		s[2] = "selenium";
		System.out.println(s[0]);
		System.out.println(s[2]);
		
		System.out.println("******************************");
		
		System.out.println(s.length);	
		
		System.out.println("******************************");
		for(int t = 0;t<s.length;t++) {
			
			System.out.println(s[t]);
		}
		
		System.out.println("******************************");
		
		// Object array - Object is the super class of all the classes "O" should be capital
		
		Object ob[] = new Object[4];
		ob[0] = "tom";
		ob[1] = 25;
		ob[2] = 23.5;
		ob[3] = "1/1/1990";
		
		System.out.println(ob[3]);
		
		System.out.println("*******************************");
		
		System.out.println(ob.length);
		
		System.out.println("********************************");
		
		for(int z=0; z<ob.length; z++) {
			System.out.println(ob[z]);
		}
		
		System.out.println("********************************");
		
		
		
		
		
		
	}

}
