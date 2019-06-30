class Fifty8
{
	public static void main(String[] args)
	{
		int row,col,value;
		System.out.println("*");
		for( row = 1; row <= 5; row++ )
		{
			System.out.print("*");
			for( col = 1;col <=row; col++)
			{
				System.out.print(col);
					
			}
			for( col =row-1;col>=1;col--)
			{
				System.out.print(col);
			}
			System.out.print("*");
			System.out.println();			
		}
		for( row =1; row<=4; row++ )
		{
			System.out.print("*");
			for( col =1;col <=(5-row);col++)
			{
				System.out.print(col);
			}
			for( col =(4-row);col>=1;col--)
			{
				System.out.print(col);
			}
			System.out.print("*");
			System.out.println();			
		}
		System.out.println("*");
		
	}
}