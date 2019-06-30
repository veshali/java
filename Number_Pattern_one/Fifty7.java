class Fifty7
{
	public static void main(String[] args)
	{
		int row,col,value;
		for( row = 1; row <= 5; row++ )
		{
			for( col = 1;col <=row; col++)
			{
				System.out.print(col);
			}
			for( col =row-1;col>=1;col--)
			{
				System.out.print(col);
			}
			System.out.println();			
		}
		for( row =1; row<=4; row++ )
		{
			for( col =1;col <=(5-row);col++)
			{
				System.out.print(col);
			}
			for( col =(4-row);col>=1;col--)
			{
				System.out.print(col);
			}
			System.out.println();			
		}
		
	}
}