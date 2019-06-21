import java.util.*;
class Five
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int d;
	System.out.println("Enter the no of days a member late:");
	d=sc.nextInt();
	if(d<=5)
	{
		System.out.println("The Fine is 50 paise");
	}
	else if(d>=6 && d<=10)
	{
		System.out.println("The Fine is 5 rupees");
	}
	else if(d>30)
	{
		System.out.println("The membership is cancelled");
	}
	
	
}
}