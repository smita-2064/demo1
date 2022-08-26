package Logical_Programs;

public class PalindromeNum {
	/*public static void main(String[] args) {
		String str="Madam";
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
			System.out.print(str.charAt(i));
		}
		System.out.println(str1);
		if(str1.equals("madam")) {
		System.out.println("Palindrome");
		}else
		{
			System.out.println("Not");
		}
		
	}*/
	
		   public static void main(String args[]) {
		      String myString = "anna";
		      StringBuffer buffer = new StringBuffer(myString);
		      buffer.reverse();
		      String data = buffer.toString();
		      if(myString.equals(data)){
		         System.out.println("Given String is palindrome");
		      } else {
		         System.out.println("Given String is not palindrome");
		      }
		   }

}
