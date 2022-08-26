package Logical_Programs;

public class StringConcatAndREverse_NoSwap {
	 public static void main(String arg[]) {
		//REVERSE String--
		 String s="Smita";
		 String s1="Sachin";
		 String s4="Nikam";
		 String s3;
		 int temp;
		 int a=20; int b=30;
		 int p=40; int q=50;
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 System.out.println(s.charAt(i));
		 }
		//String CONCAT Of 3 string
		 s3=(s.concat(s1));
		 System.out.println("Concatenation of 3 String is = " +(s3.concat(s4)));
		 
		//NUMbers SWApping with Third Variable
		 temp=a;
		a=b;
		b=temp;
		System.out.println("A="+a+" "+"B="+b);
		
		//NUMBERS Swapping without third variable
		p=p+q;
		q=p-q;
		p=p-q;
		System.out.println("P="+p+" "+"Q="+q);
		 
		 
	}

}
