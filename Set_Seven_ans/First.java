import java.util.*;
class First
{

	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int t,pt,pa=0;
		for(int i=1;i<=10;i++)
		{
			 System.out.println("Enter time for which employee works:");
			 t=sc.nextInt();
			if(t>40)
			{
				pt=t-40;
				pa=pa+(pt*12);
			}
		
			System.out.println("overtime pay of employee:");
			System.out.println(pa);
		}
			
		
		
		
		
	}

}