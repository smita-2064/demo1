package Logical_Programs;

public class PalindromeStr {
	public static void main(String[] args) {
	 String myString = "anna";
     StringBuffer buffer = new StringBuffer(myString);
     buffer.reverse();
	
     String data = buffer.toString();
     
     if(myString.equals(data))
     {
    	 System.out.println("Palindrome");
     }
     else
     {
    	 System.out.println("Not palindrome");
     }

}
}
