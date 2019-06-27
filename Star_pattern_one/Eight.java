class Eight
{
	public static void main(String[]args)
	{
		int row,col;
		int space=4;
		int star=1;
		for( row=1;row<=9;row++)
		{
			for(col=1;col<=space;col++)
			{
				System.out.print(" ");
			}
			for(col=1;col<=star;col++)
			{
				if(col==1 || col==star)
					System.out.print("*");
				else
					System.out.print(" ");
					
			}
			if(row<5)
			{
				space--;
				star=star+2;
			}
			else
			{
				space++;
				star=star-2;
			}
			System.out.println();
		}
		
	}
}