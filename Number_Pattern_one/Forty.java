class Forty
{
	public static void main(String[]args)
	{
		int row,col;
		int x;
		for(row=1;row<=5;row++)
		{
			if(row%2!=0)
			x=1;
			else
			x=2;
			for(col=1;col<=row;col++,x+=2)
			{
				System.out.print(x);
			}			
			System.out.println();
		}

	}
}