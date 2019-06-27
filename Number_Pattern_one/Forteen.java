class Forteen
{
	public static void main(String[]args)
	{
		int row,col;
		for(row=5;row>=1;row--)
		{
			for(col=5;col>=row;col--)
			{
				System.out.print(col);
			}
			for(col=1;col<=(row-1);col++)
			{
					System.out.print(row);
			}
			System.out.println();
		}			
		
		
	}

}