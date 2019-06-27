class Eight
{
	public static void main(String[]args)
	{
		int row,col;
		for(row=1;row<=5;row++)
		{
			for(col=1;col<=5;col++)
			{
				if((row==1 && (col==1 || col==5)) || (row==5 && (col==1 || col==5)) || (row==2 && (col==2 || col==4)) || (row==4 && (col==2 || col==4)) || (row==3 && col==3))
				{
					System.out.print("1");
				}
				else 
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}		
		
		
	}

}