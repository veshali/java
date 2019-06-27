class Second
{
	public static void main(String[]args)
	{
		int row,col;
		for(row=1;row<=5;row++)
		{
			for(col=1;col<=5;col++)
			{
				if(row%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
				System.out.println();
		}		
		
		
	}

}