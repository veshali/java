class Thirteen
{
	public static void main(String[] args)
	{
		int row,col;
		for( row =1; row<=4; row++)
		{
			for( col =1;col<=(2*row-1);col++)
			{
			if(col%2==0)
				System.out.print("*");
			else
				System.out.print(row);

			}
			System.out.println();
		}
		for( row =4; row>=1; row--)
		{
			for( col =1;col<=(2*row-1);col++)
			{
			if(col%2==0)
				System.out.print("*");
			else
				System.out.print(row);

			}
			System.out.println();
		}
	}
}