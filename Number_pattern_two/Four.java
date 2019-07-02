class Four
{
	public static void main(String[] args)
	{
		int row,col,k;
		for( row =1;row<=5;row++)
		{
			int value=(2*row-1);
			for( col =1;col<=(6-row);col++)
			{
				System.out.print(value);
				value=value+2;
			}
			System.out.println();			
		}
	}
}