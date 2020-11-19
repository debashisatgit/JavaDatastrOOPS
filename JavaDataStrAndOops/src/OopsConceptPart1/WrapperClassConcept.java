package OopsConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		// frm a web page while using get text method, is 200 ,have to convert it into int ,that time have to use wrapper classes
		
		String x ="100";
		System.out.println(x+20);        //simple string concinadition within double quotes
		
		//data conversion string to int
		
		int i = Integer.parseInt(x);     //to change the value of x into integer , i Integer is a wrapper class
		System.out.println(i+20);
		
		//data conversion string to double
		
		String y = "22.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//data conversion string to char is not possible bcz no method are there
		
		//String to boolian
		String k = "True";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//Integer to string conversion
		
		int j = 100;
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		
		
		

	}

}
