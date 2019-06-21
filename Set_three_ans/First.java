import java.util.*;
class First
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int value;
	System.out.println("Enter the age of candidate");
	value=sc.nextInt();
	if(value >=18)
	{
		System.out.println("He is eligible for casting his own vote");
	}
	else
	{
		System.out.println("He is not eligible for casting his own vote");
	}
	
	
}
}