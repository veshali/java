class Seven
{
	public static void main(String[] args)
	{
		int row,col;
		for( row =1;row<=5;row++)
		{
			for( col =1;col<=row;col++)
			{
				if(col==2 || col==4)
				System.out.print("0");
				else
				System.out.print("1");
				
			}
			System.out.println();			
		}
	}
}