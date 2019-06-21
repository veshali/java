import java.util.*;
class Second
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int value;
	System.out.println("Enter the height of a person:");
	value=sc.nextInt();
	if(value <150)
	{
		System.out.println("He is small in height");
	}
	else if(value>=150 && value<=250)
	{
		System.out.println("He is medium in height");
	}
	else
	{
		System.out.println("He is large in height");
	}
	
	
}
}