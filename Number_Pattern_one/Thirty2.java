class Thirty2
{
	public static void main(String[]args)
	{
		int row,col,k;
		for(row=1;row<=5;row++)
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