class TwentyTwo
{
	public static void main(String[]args)
	{
		int row,col;
		for(row=1;row<=9;row++)
		{
			for(col=1;col<=5;col++)
			{
				if((row==1 && (col==1 || col==5)) || (row==9 && (col==1 ||col==5)) || (row==5 && (col==1 || col==5)))
				{
					System.out.print(" ");
				}
				else if(row==1 || row==9 || col==1 || col==5 || row==5)
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



					
		