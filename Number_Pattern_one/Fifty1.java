class Fifty1
{
	public static void main(String[] args)
	{
		int row,col,value;
		int count=0;
		for( row = 1; row <= 5; row++ )
		{
			if(row%2!=0)
			{
				value=count+1;
			}
			else
			{
				value=count+row;
			}
			for( col = 1;col <=row; col++)
			{
					System.out.print(value+" ");
					if(row%2!=0)
						value++;
					else
						value--;
					count++;
			}				
			System.out.println();
		}
	}
}