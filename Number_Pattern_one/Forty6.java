class Forty6
{
	public static void main(String[] args)
	{
		int row,col,x;
		for( row = 1; row <= 5; row++ )
		{
			x=row;
			int value=1;
			for( col = 1; col <= row; col++)
				{
					if(row%2!=0)
					{
						System.out.print(value);
						value++;
					}
					else
					{
						System.out.print(x);
						x--;
					}
				}
			System.out.println();
		}
	}
}