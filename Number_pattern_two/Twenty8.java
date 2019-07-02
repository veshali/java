class Twenty8
{
	public static void main(String[] args)
	{
		int i,j;
		int value=1;
		int space=6;
		int space1=2;
		for(i=1;i<=4;i++)
		  {
			for(j=1;j<=space;j++)
			{
			  System.out.print(" ");
			}
			space=space-2;
			System.out.print(i);
			for(j=2;j<=(i-1)*4;j++)
			{
			  System.out.print(" ");
			}
			if(i>1)
			  System.out.print(i);
			System.out.println();
		  }
		  
		  for(i=3;i>=1;i--)
		  {
			for(j=1;j<=space1;j++)
			{
			  System.out.print(" ");
			}
			space1=space1+2;
			System.out.print(i);
			for(j=2;j<=(i-1)*4;j++)
			{
			  System.out.print(" ");
			}
			if(i>1)
			  System.out.print(i);

			System.out.println();
		  }

		  
		
	}
}