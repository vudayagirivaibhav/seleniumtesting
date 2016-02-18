package ProgramsHw;

import java.util.Stack;

public class StringReverse {

	public static void main(String[] args) {
	   
		char[] str= "One two three four ".toCharArray();
		
		getReverse(str);
		
		System.out.println(str);

	}

	private static void getReverse(char[] str) {
		
		StringReverse sr = new StringReverse();
		String revStr = sr.reverseString(str);
		System.out.println("Reverse String :" + revStr);
		
		String[] strArr = revStr.split(" ");		
		StringBuffer buff = new StringBuffer();
		
		
		for(int i=0; i<strArr.length;i++)
		{
			buff.append(sr.reverseString(strArr[i])+" ");
		}
		System.out.println("Reversed Word is "+buff);
	

	
	}

	

	private String reverseString(String string) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		for(Character c: string.toCharArray())
		{
			stack.push(c);
		}
		
		StringBuffer revStr = new StringBuffer();
		for(int i= 0 ; i<string.length();i++)
		{
			revStr.append(stack.pop());
		}
		System.out.println("Reverrse string: "+revStr);
		return string;
	}

	

}
