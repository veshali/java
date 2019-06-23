class Four
{
	public static void main(String[] args)
	{
		int d,sum;
		System.out.println("Armstrong numbers are:");
		for(int i=1;i<=500;i++)
		{
			int a=i;
			sum=0;
			while(a>0)
			{
			d=a%10;
			sum=sum+(d*d*d);
			a=a/10;
			}
			if(sum==i)
				System.out.println(i);
				 
		}
		






	}
}