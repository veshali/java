class Forty9
{
	public static void main(String[] args)
	{
		int row,col;
		for( row = 1; row <= 5; row++ )
		{
			int value=row;
			int space=4;
			for( col = 1;col <=row; col++)
			{
					System.out.print(value+" ");
					value=value+space;
					space--;
					
			}				
			System.out.println();
		}
	}
}