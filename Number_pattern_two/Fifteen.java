/*
              1
            2 3
          4 5 6
       7 8 9 10
 11 12 13 14 15
*/


class Fifteen
{
	public static void main(String[] args)
	{
		int row,col,k;
		int value=1;
		for( row =1; row<=5; row++)
		{
			for( col =5;col>=1;col--)
			{
				if(col>row)
					System.out.print("   ");
				else
				{
					System.out.print(value);
					if(value<9)
						System.out.print("  ");
					else if(value<99)
						System.out.print(" ");
					else
						System.out.print("");
					value++;
				}
			}
			System.out.println();
		}
	}
}