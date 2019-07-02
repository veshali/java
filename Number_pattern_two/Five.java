class Five
{
	public static void main(String[] args)
	{
		int row,col,k;
		for( row =5;row>=1;row--)
		{
			for( col =row;col<=5;col++)
			{
				System.out.print(col);
			}
			for( col =row;col>1;col--)
			{
				System.out.print("5");
			}
			System.out.println();			
		}
	}
}