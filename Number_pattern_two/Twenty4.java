class Twenty4
{
	public static void main(String[] args)
	{
		int row,col;
		for( row = 1; row <= 5; row++ )
		{
			for( col = 1; col <= 5 - row; col++ )
			{
				System.out.print(" ");				
			}
			for( col = 1; col <= row; col++ )
			{
				System.out.print(col);
			}	
			int value=row+1;
			for( col = (row-1); col >=1; col-- )
			{
				System.out.print(value);
				value++;
			}			
			System.out.println();
		}
		
		for( row = 4; row>=1; row-- )
		{
			for( col = 1; col <=(5-row); col++ )
			{
				System.out.print(" ");				
			}
			for( col = 1; col <=(2*row-1); col++ )
			{
				System.out.print(col);
			}	
						
			System.out.println();
		}
	}
}