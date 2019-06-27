import java.util.*;
class First
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a,b;
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		int max,lcm;
		max=(a>b)?a:b;
		while(true)
		{
			if(max%a==0 && max%b==0)
				{
					 System.out.println("LCM of given two numbers is: " +max);	
					break;
				}
			max++;
		}

		
	}	
}