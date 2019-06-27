import java.util.*;
class TwentyThree
{
	public static void main(String[] args)
	{
		int row,col;
		int space=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any name:");
		String name=sc.next();
		int l=name.length();
		int x=(int)Math.ceil((19-l)/2);
		System.out.println(x);
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
		for(row=6;row<=6;row++)
		{
			for(col=1;col<=x;col++)
			{
				System.out.print("*");
			}
				System.out.print(name);
	
			for(col=1;col<=(19-x-l);col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(row=9;row>=1;row--)
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




		