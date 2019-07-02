class Twenty2
{
	public static void main(String[] args)
	{
		int row,col;
		int value=1;
		int diff=3;
		int space=20;
		for( row =1; row<=5; row++)
		{
			for(col=1;col<=space;col++)
			{
				System.out.print(" ");
			}			
			space=space-5;
			for( col =1;col<=(2*row-1);col++)
			{
					System.out.print(" "+value);
					if(value<9)
						System.out.print("   ");
					else if(value<99)
						System.out.print("  ");
					else
						System.out.print(" ");
					value=value+diff;
					diff=diff+2;
			}
			System.out.println();
		}
	}
}