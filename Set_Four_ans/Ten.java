import java.util.*;
class Ten
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int o,s;
	String c,c1="OK";
	System.out.println("Enter the Customer order:");
	o=sc.nextInt();
	System.out.println("Enter the Stock:");
	s=sc.nextInt();
	System.out.println("Enter the credit");
	c=sc.next();
	int ans=c.compareTo(c1);
	if( o<=s && ans==0 )
	{
		System.out.println("supply has requirement");
	}
	else if((!(ans==0)))
	{
		System.out.println("Do not supply");
	}
	else if(s<=o && ans==0)
	{
		System.out.println("The balance will be shipped");
	}

	
}
}