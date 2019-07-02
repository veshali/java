class Nine
{
	public static void main(String[] args)
	{
		int row,col;
		int space=0;
		for( row = 1; row <=4; row++ )
		{
			for( col =1;col<=(5-row); col++)
			{
				System.out.print(col);
			}
			for( col =1;col<=space; col++)
			{
				System.out.print("*");
			}
			space=space+2;
			for( col =(5-row);col>=1; col--)
			{
				System.out.print(col);
			}			
			System.out.println();
		}
	}
}