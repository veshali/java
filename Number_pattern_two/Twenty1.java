class Twenty1
{
	public static void main(String[] args)
	{
		int row,col;
		for( row =1; row<=5; row++)
		{
			for( col =row;col<=5;col++)
			{
				if(row%2==1)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}