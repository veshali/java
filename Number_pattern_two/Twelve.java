class Twelve
{
	public static void main(String[] args)
	{
		int row,col;
		System.out.println("0");
		for( row = 9; row>=1; row--)
		{
			for( col =row;col<10; col++)
			{
				System.out.print(col);
			}
			System.out.print("0");
			
			for( col =9;col>=row; col--)
			{
				System.out.print(col);
			}	
			System.out.println();
		}
	}
}