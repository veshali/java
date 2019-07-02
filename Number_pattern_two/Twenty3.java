class Twenty3
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
			
				int value=1;
			for( col = 1; col <= row; col++ )
			{
				if( col % 2 == 0 )
				{
					System.out.print(" ");
				}					
				else
				{
					System.out.print(value);
					value++;
				}
			}
			for( col = row - 1; col >= 1; col-- )
			{
				if( col % 2 == 0 )
				{
					System.out.print(" ");
				}					
				else
				{
					System.out.print(value);
					value++;
				}
			}
	
			
			
			
			System.out.println();
		}
	}
}