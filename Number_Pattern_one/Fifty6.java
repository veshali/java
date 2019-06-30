class Fifty6
{
	public static void main(String[] args)
	{
		int row,col,value;
		int count=0;
		for( row = 1; row <= 5; row++ )
		{
			value=row+1;
			for( col = 1;col <=row; col++)
			{
				System.out.print(col);
			}
			for( col =(row-1);col>=1;col--)
			{
				System.out.print(value);
				value++;
			}
			System.out.println();			
		}
		for( row =4; row>=1; row-- )
		{
			for( col =1;col <=(2*row-1); col++)
			{
				System.out.print(col);
			}
			System.out.println();			
		}
		
	}
}