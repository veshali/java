class Nine
{
	public static void main(String[]args)
	{
		int row,col;
		for(row=1;row<=5;row++)
		{
			for(col=1;col<=5;col++)
			{
				if((row==1 && (col==1 || col==5)) || (row==5 && (col==1 || col==5)))
				{
					System.out.print("0");
				}
				else if(col==1 || col==5 || row==1 || row==5)
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