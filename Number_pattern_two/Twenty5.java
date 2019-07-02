class Twenty5
{
	public static void main(String[] args)
	{
		int row,col;
		for( row = 1; row <= 4; row++ )
		{
			for( col = 1; col <=9; col++ )
			{
				if(row==col || col==5 || row+col==10)
					System.out.print("*");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}