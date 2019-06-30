class Fifty2
{
	public static void main(String[] args)
	{
		int row,col,value;
		int count=0;
		for( row = 1; row <= 5; row++ )
		{
			for( col = 1;col <=row; col++)
			{
					if(row<=3)
						System.out.print(row);
					else
						System.out.print(5-row+1);
			}				
			System.out.println();
		}
	}
}