package Logical_Programs;

public class prime_Number {
	public static void main(String[] args) {
		for (int i = 2; i <= 10; i++)   //i=2 
        {
            boolean isPrime = true;
            for (int j=2; j <= i/2; j++)    //j=2  and j=i/2=1
            {  
                if ( i % j == 0)    //2%2=1
                {
                    isPrime = false;  //compiler cant go inside  bacause of condition get failed 
                    break;
                }
            }
            if ( isPrime == true )   //checks is true then it will print on screen  
                System.out.println(i);
}
}
}