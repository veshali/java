class Eighteen
{
	public static void main(String[] args)
	{
		int row,col;
		
		for( row =1; row<=4; row++)
		{
			int k=2;
			for( col =row;col>=1;col--)
			{
				System.out.print(col);
			}
			for( col =(row-1);col>=1;col--)
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}
}