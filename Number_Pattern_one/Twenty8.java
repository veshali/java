class Twenty8
{
	public static void main(String[]args)
	{
		int row,col;
		for(row=1;row<=5;row++)
		{
			for(col=5;col>=(6-row);col--)
			{
				System.out.print(col);
			}
			System.out.println();
		}
		
	}
}