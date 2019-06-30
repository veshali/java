class Thirty7
{
	public static void main(String[]args)
	{
		int row,col,k;
		k=1;
		for(row=1;row<=5;row++)
		{
			for(col=1;col<=row;col++)
			{
				if(k%2==1)
				System.out.print("1");
				else
				System.out.print("0");
				k++;
			}			
			System.out.println();
		}

	}
}