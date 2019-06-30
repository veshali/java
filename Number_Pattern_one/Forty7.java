class Forty7
{
	public static void main(String[] args)
	{
		int row,col;
		int value=1;
		int colcount=1;
		for( row = 1; row <= 5; row++ )
		{
			for( col = 1; col <=colcount; col++)
				{
					if(value==10)
						value=1;	
					System.out.print(value);
					value++;
				}
				colcount=colcount*2;
			System.out.println();
		}
	}
}