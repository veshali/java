class Thirty4
{
	public static void main(String[]args)
	{
		int row,col,k;
		for(row=1;row<=5;row++)
		{
			k=(row*2-1);
			for(col=row;col<=5;col++)
			{
				System.out.print(k);
				k=k+2;
			}
			System.out.println();
		}
		
	}
}