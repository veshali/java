class Third
{
	public static void main(String[] args)
	{
		int row,col,k;
		for( row =1;row<=4;row++)
		{
			for( col =row;col>=1;col--)
			{
				System.out.print(col%2);
			}
			System.out.println();			
		}
	}
}