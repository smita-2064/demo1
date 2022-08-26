package Logical_Programs;

import java.util.Arrays;
public class ArraytoString {
	public static void main(String[] args) {
		

		String[] s=new String[3];
		s[0]="I";
		s[1]="Am";
		s[2]="smita";
	  	String s1=Arrays.toString(s); 
		 for(int i=1;i<s1.length()-1;i++)
	  {
		  System.out.print(s1.charAt(i));
	  }
	}

}
