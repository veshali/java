import java.util.*;
class Ten
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int ra,sa,aa;
	System.out.println("Enter age of Ram:");
	ra=sc.nextInt();
	System.out.println("Enter age of Shyam:");
	sa=sc.nextInt();
	System.out.println("Enter age of Ajay:");
	aa=sc.nextInt();
	if(ra<sa && ra<aa)
	{
		System.out.println("Ram is youngest");
	}
	else if(sa<ra && sa<aa)
	{
		System.out.println("Shyam is youngest");
	}
	else
	{
		System.out.println("Ajay is youngest");
	}
	
}
}