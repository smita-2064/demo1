package javaProgram;

public class Upcasting {
	public static void main(String[] args) {
		Upcasting1 p=new Upcasting2();
		p.m1();
		Upcasting2 c=(Upcasting2)p;
		c.m1();
		
	} 

}
