class Forty1
{
	public static void main(String[]args)
	{
		int row,col;
		int x;
		for(row=1;row<=5;row++)
		{
			int k=1;
			for(col=1;col<=row;col++)
			{
				System.out.print(k);
				k=k+2;
			}
			for(col=row-1;col>=1;col--)
			{
				x=(2*col-1);
				System.out.print(x);
				x=x-2;
			}
			System.out.println();
		}

	}
}