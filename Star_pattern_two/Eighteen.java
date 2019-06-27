class Eighteen
{
	public static void main(String[]args)
	{
		int row,col;
		for(row=1;row<=5;row++)
		{
			for(col=1;col<=(2*row-2);col++)
			{
				System.out.print(" ");
			}
			for(col=row;col<=5;col++)
			{
				System.out.print("*");					
			}	
			System.out.println();

		}
		int space=6;

			for(row=2;row<=5;row++)
			{
				for(col=1;col<=space;col++)
				{
					System.out.print(" ");
				}
				for(col=1;col<=row;col++)
				{
					System.out.print("*");					
				}
				space=space-2;
				System.out.println();
			}
		
	



	}
}



					
		