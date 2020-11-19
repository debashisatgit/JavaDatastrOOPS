package JavaBasicsN;

public class TwoDArray {

	public static void main(String[] args) {
	// 2D Array
		
	String a []	[] = new String [3][5];         // with 2 square bracket is 2d array
	
	System.out.println(a.length);               //total num of rows = 3
	
	System.out.println("****************************");
	
	System.out.println(a[0].length);   //total num of colum = 5, colum are totally based on rows for each row 5 colum r there
	
	System.out.println("****************************");
	
	a[0][0] = "A";                     //0 row 0 colum
	a[0][1]	= "B";
	a[0][2] = "C";
	a[0][3] = "D";
	a[0][4] = "E";
		
	a[1][0] = "A1";                     //1 row 0 colum
	a[1][1]	= "B1";
	a[1][2] = "C1";
	a[1][3] = "D1";
	a[1][4] = "E1";
	
	a[2][0] = "A2";                     //2 row 0 colum
	a[2][1]	= "B2";
	a[2][2] = "C2";
	a[2][3] = "D2";
	a[2][4] = "E1";
		
	System.out.println(a[1][2]);	
	System.out.println(a[0][4]);
	System.out.println(a[2][0]);
	System.out.println("******************************");
	//print all the values of 2D array
	
	for(int row=0;row<a.length;row++) {
		
		for(int col=0;col<a[0].length;col++) {
			
			   System.out.println(a[row][col]);			
		}
		
	}
		
		
		
		
		
		
	}

}
