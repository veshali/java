import java.util.*;
class Six
{
	public static void main(String[]args)
	{

		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		a=sc.nextInt();
		while(a%2==0)
		{
			System.out.println("2");
			a=a/2;
		}
		
		for (int i = 3; i <= Math.sqrt(a); i = i+2) 
		{ 
        // While i divides a, print i and divide a 
			while (a%i == 0) 
			{ 
			   System.out.println(i);
			   a = a/i; 
			} 
		}
		if(a>2)
			System.out.println(a);
		
	}
}

	
