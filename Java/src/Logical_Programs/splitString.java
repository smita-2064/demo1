package Logical_Programs;

public class splitString {
	public static void main(String[] args) {
		

	String s=new String("I am - Smita");
  String[] s1=s.split("-");
	//System.out.println(s1.);
  for(int i=0;i<s1.length;i++)
  {
	  System.out.print(s1[i]);
  }

}
}