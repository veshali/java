class Eleven
{
	public static void main(String[]args)
	{
		int row,col;
		for(row=5;row>=1;row--)
		{
			for(col=1;col<=row;col++)
			{
				if(col==1 || col==row || row==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}				
			System.out.println();
			
		}



	}
}