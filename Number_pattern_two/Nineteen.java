class Nineteen
{
	public static void main(String[] args)
	{
		int row,col;
		int value=1;
		for( row =5; row>=1; row--)
		{
			for( col =1;col<=row;col++)
			{
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
		}
	}
}