class Fifty9
{
	public static void main(String[] args)
	{
		int row,col;
		for( row = 1; row <=9; row++ )
		{
			int value=row;
			for( col = 1;col <=9; col++)
			{
				if(row==col || col==10-row)
				{
					System.out.print(value);
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.println();			
		}
		
	}
}