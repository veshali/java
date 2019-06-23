import java.util.*;
class Second
{
public static void main(String[]args)
{
	System.out.println("Enter any number upto which you want to print the series:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("Series of even numbers is:");
		
	for(int i=2;i<=a;i=i+2)
	{
		System.out.print(i+"\t");
		
	}
	
	
	
	
	
	
}
}