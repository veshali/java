class Forty5
{
	public static void main(String[] args)
	{
		int row,col,value=1;
		for( row = 1; row <= 5; row++ )
		{
			for( col = 1; col <= row; col++ )
				{
					System.out.print( value+" ");
					value++;
				}
			System.out.println();
		}
	}
}