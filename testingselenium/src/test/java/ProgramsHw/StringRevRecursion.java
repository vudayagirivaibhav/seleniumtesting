package ProgramsHw;

public class StringRevRecursion {

	
	public static void main(String args[])
	{
		String str = "Bayamp";
		System.out.println("Reverse String: "+ reverseString(str));
			
		
	}

	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		if(str == null || str.length() <= 1)
		{
			return str;
		}		
		return reverseString(str.substring(1))+ str.charAt(0);
	}
}
