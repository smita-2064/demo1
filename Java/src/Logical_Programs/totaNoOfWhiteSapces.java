package Logical_Programs;

public class totaNoOfWhiteSapces {
	public static void main(String[] args) {
		
			String str="s m i t";
			//char ch;
			int c=0;
			for( int i=0;i<=str.length()-1;i++)
			{
				char ch=str.charAt(i);
			
			if(ch==' ')
			{
			c++;
			}
			
		}
			System.out.println(c);  
	}
	

}
