class Thirty6
{
	public static void main(String[]args)
	{
		int row,col;
		for(row=1;row<=5;row++)
		{
			for(col=1;col<=row;col++)
			{
				if(row==1 || row==3 || row==5)
				System.out.print("1");
				else
				System.out.print("0");
			}
			System.out.println();
		}

	}
}