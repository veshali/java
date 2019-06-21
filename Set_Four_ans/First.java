import java.util.*;
class First
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int yr;
	System.out.println("Enter a year:");
	yr=sc.nextInt();
	if(((yr%4==0)||(yr%400==0)) && (yr%100!=0))
	{
		System.out.println("Given year is a leap year");
	}
	else
	{
		System.out.println("Given year is not a leap year");
	}
	
	
}
}