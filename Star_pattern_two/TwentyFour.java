import java.util.*;
class TwentyFour
{
	public static void main(String[] args)
	{
		int row,col;
		int space=5;
		
		for( row = 3; row <= 5; row++ )
		{
			for( col = row; col <5; col++ )
			{
				System.out.print(" ");
			}
			for( col = 1; col <=(2*row-1); col++ )
			{
				System.out.print("*");
			}
			for(col =1;col<=space;col++ )
			{
				System.out.print(" ");
			}
			space=space-2;
			for( col = 1; col <=(2*row-1); col++ )
			{
				System.out.print("*");
			}
			
			System.out.println();	
		}
		
		
		for(row=10;row>=1;row--)
		{
			for( col = row; col <10; col++ )
			{
				System.out.print(" ");
			}
			for( col = 1; col <=(2*row-1); col++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
							
	}
}




		