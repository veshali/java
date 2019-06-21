import java.util.*;
class Four
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int h,t;
	float c;
	System.out.println("Enter the hardness:");
	h=sc.nextInt();
	System.out.println("Enter a Carbon content:");
	c=sc.nextFloat();
	System.out.println("Enter Tensile strength:");
	t=sc.nextInt();
	if((h>50)&&(c <0.7)&&(t>5600))
	{
		System.out.println("The Grade is 10");
	}
	else if((h>50)&&(c <0.7)&&(!(t>5600)))
	{
		System.out.println("The Grade is 9");
	}
	else if((!(h>50))&&(c <0.7)&&(t>5600))
	{
		System.out.println("The Grade is 8");
	}
	else if((h>50)&&(!(c <0.7))&&(t>5600))
	{
		System.out.println("The Grade is 7");
	}
	else if((h>50)||(c <0.7)||(t>5600))
	{
		System.out.println("The Grade is 6");
	}
	else 
	{
		System.out.println("The Grade is 5");
	}
	
	
}
}