class Twenty
{
	public static void main(String[] args)
	{
		int row,col;
		for( row =1; row<=4; row++)
		{
			int k=row;
			for( col =1;col<=(5-row);col++)
			{
				System.out.print(k);
				k++;
			}
			for( col =(row-1);col>=1;col--)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}
}