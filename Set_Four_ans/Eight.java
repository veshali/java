import java.util.*;
class Eight
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int t;
	System.out.println("Enter the time taken by the worker:");
	t=sc.nextInt();
	

	if(t>=2 && t<=3)
	{
		System.out.println("The Worker is highly efficient");
	}
	else if(t>=3 && t<=4)
	{
		System.out.println("The Worker has to improve his speed");
	}
	else if(t>=4 && t<=5)
	{
		System.out.println("The training should be given to the worker");
	}
	else if(t>5) 
	{
		System.out.println("The Worker has to leave the company");
	}
	
}
}