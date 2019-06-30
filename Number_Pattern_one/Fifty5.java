class Fifty5
{
	public static void main(String[] args)
	{
		int row,col,value;
		int count=0;
		for( row = 1; row <= 5; row++ )
		{
			for( col = 1;col <=row; col++)
			{
				System.out.print(col);
			}
			System.out.println();			
		}
		for( row = 1; row <= 5; row++ )
		{
			for( col = 1;col <=(5-row); col++)
			{
				System.out.print(col);
			}
			System.out.println();			
		}
	}
}