
class Thirteen
{
	public static void main(String[] args)
	{
		int row,col,space,star;
		for( row = 1; row <= 5; row++ )
		{
			for( col = row; col <5; col++ )
			{
				System.out.print(" ");
			}
			for( col = 1; col <=(2*row-1); col++ )
			{
				if(col==1 || col==(2*row-1) || row==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
	}
}