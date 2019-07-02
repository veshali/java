class Second
{
	public static void main(String[] args)
	{
		int row,col,k;
		for( row =5;row>=1;row--)
		{
			if(row%2==1)
				k=1;
			else
				k=row;
			for( col =1;col <=row; col++)
			{
				System.out.print(k);
				if(row%2==1)
					k++;
				else
					k--;
			}
			System.out.println();			
		}
	}
}