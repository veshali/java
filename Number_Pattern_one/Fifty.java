class Fifty
{
	public static void main(String[] args)
	{
		int row,col;
		int diff=1;
		int value=1;
		for( row = 1; row <= 5; row++ )
		{
			for( col = 1;col <=row; col++)
			{
					System.out.print(value+" ");
					value=value+diff;
					diff++;
					
			}				
			System.out.println();
		}
	}
}