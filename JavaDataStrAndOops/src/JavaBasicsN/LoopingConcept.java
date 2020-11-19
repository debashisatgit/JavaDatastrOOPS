package JavaBasicsN;

public class LoopingConcept {

	public static void main(String[] args) {
		
		//Print top 10 integer num
		
		//1. while loop
		//disadvantage of while loop - it will give infinite loop if you will not giv increment or decrement part
		
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i=i+1;                     // i = 1 + 1 = 2 again it will go 2 is less then 10 print 2 and 2 +1 = 3 again it will check with 3 less the 10 then print 3 again 3+1 = 4
		}
		System.out.println("************************************");
		
		//2. For loop
		
		//printing in acceding order 1 to 10
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
		System.out.println("************************************");
		//printing in descending order 10 to 1
		for(int k=10;k>=1;k--) {
			System.out.println(k);
		}
		
		
		
		
		
		
		
	}

}
