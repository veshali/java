class Forteen
{
	public static void main(String[] args)
	{
		int row,col,k;
		int value=1;
		for( row =1; row<=4; row++)
		{
			k=value;
			for( col =1;col<=row;col++)
			{
				System.out.print(k);
				k++;
			}
			value=k--;
			for(col=1;col<row;col++)
			{
				System.out.print(--k);
				
			}
			System.out.println();
		}
	}
}