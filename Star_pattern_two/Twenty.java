class Twenty
{
	public static void main(String[]args)
	{
		int row,col;
		for(row=1;row<=9;row++)
		{
			
			for(col=1;col<=8;col++)
			{
				if(row==5 || col==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
	
			}	
			System.out.println();

		}
	}
}



					
		