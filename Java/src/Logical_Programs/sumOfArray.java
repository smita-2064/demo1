package Logical_Programs;

public class sumOfArray {
public static void main(String[] args) {
	int sum=0;

	int[] ar= {10,20,30};
	for(int i=0;i<=ar.length-1;i++)
	{
		//int sum=0;
		sum=sum+ar[i];
	}
	System.out.println(sum); 
}
}
