class Forty8
{
	public static void main(String[] args)
	{
		int row,col;
		int space=4;
		for( row = 1; row <= 5; row++ )
		{
			for( col = 1; col <=row; col++)
			{
					System.out.print(col);
			}
			for(col=1;col<=space;col++)
			{
				System.out.print("  ");
			}
			space--;
			for( col = row; col >=1; col--)
			{
					System.out.print(col);
			}				
			System.out.println();
		}
	}
}