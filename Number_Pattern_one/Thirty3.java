class Thirty3
{
	public static void main(String[]args)
	{
		int row,col,k;
		for(row=5;row>=1;row--)
		{
			k=row;
			for(col=1;col<=row;col++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		
	}
}