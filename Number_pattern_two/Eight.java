class Eight
{
	public static void main(String[] args)
	{
		int row,col;
		for( row = 1; row <=4; row++ )
		{
			for( col = 1;col<=(2*row-1); col++)
			{
				System.out.print(col);
			}				
			System.out.println();
		}
	}
}