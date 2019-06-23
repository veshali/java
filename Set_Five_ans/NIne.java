import java.util.*;
class Nine
{
public static void main(String[]args)
{

	int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number:");
	a=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		int ans=a*i;
		System.out.println(a + "*" + i + "=" +ans);
	}

	
}
}