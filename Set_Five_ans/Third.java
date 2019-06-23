import java.util.*;
class Third
{
public static void main(String[]args)
{
	System.out.println("Enter any number upto which you want to print the series:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("Series of even numbers is:");
	int i=2;
	while(a>0)
	{
		System.out.print(i+"\t");
		i=i+2;
		a--;
	}
	
	
	
	
	
	
}
}