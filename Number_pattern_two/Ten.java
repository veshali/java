class Ten
{
	public static void main(String[] args)
	{
		int row,col;
		int space=4;
		int value=1;
		for( row = 1; row <=3; row++ )
		{
			for( col =1;col<=space; col++)
			{
				System.out.print(" ");
			}
			space=space-2;
			for( col =1;col<=(2*row-1); col++)
			{
				System.out.print(value+" ");
				value++;
			}
					
			System.out.println();
		}
	}
}