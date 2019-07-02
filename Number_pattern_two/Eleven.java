class Eleven
{
	public static void main(String[] args)
	{
		int row,col;
		for( row = 1; row<=5; row++)
		{
			for( col =5;col>=1; col--)
			{
				if(row==col)
					System.out.print("*");
				else
				{
					System.out.print(col);				
				}
			}
				
			System.out.println();
		}
	}
}