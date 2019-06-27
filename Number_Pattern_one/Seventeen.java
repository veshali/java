class Seventeen
{
	public static void main(String[]args)
	{
		int row,col;
		for(row=1;row<=5;row++)
		{
			for(col=row;col>=1;col--)
			{
				System.out.print(col);
			}
			for(col=2;col<=(6-row);col++)
			{
					System.out.print(col);
			}
			System.out.println();
		}			
		
		
	}

}