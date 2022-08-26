package Logical_Programs;

//import java.lang.reflect.Array;

public class AscDescOrderNo {
	public static void main(String arg[])
	{
	int arr[]=new int[5];
	arr[0]=20;
	arr[1]=76;
	arr[2]=12;
	arr[3]=10;
	arr[4]=100;
	//ascending 
	System.out.println("Ascending order");

	for( int i=0;i<=arr.length-1;i++)
	{
		
		System.out.println(arr[i]);
	}
	//descending order
	System.out.println("Desceding order");
	for(int i=arr.length-1;i>=0;i--)
	{
		
		System.out.println(arr[i]);
	}
	
}

}