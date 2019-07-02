import java.util.*;
class Twenty9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int l=(int)Math.ceil(Math.log10(n));
		int a=(int)Math.pow(10,l-1);
		System.out.println("Result:");
		for(int i=a;i<n;i/=10)
		{
			System.out.println(n);
			n=n%i;
		}


				
	}
}
















