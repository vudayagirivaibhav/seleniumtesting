package ProgramsHw;

public class sumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123";
		String str1 = "234";
		
		System.out.println("Sum of two numbers :" +getSum(str, str1));
	}

	private static int getSum(String str, String str1) {
		int sum =0;
		int num1 =0; int num2=0;
		num1 = stringtoInt(str);
		num2 = stringtoInt(str1);
		
		return sum= num1+num2;
	}

	private static int stringtoInt(String str) {
		// TODO Auto-generated method stub
		   int i = 0, number = 0;
	        
	        int len = str.length();
	       
	        while( i < len ){
	            number *= 10;
	            number += ( str.charAt(i++) - '0' );
	        }
	       
	        return number;
	    }   
	
}
