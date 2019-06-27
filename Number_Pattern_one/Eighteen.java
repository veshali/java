class Eighteen
{
	public static void main(String[]args)
	{
		int row,col;
		for(row=9;row>=1;row--)
		{
			for(col=1;col<=9;col++)
			{
				if(row==1 || row==9 || col==1 || col==9)
				{
					System.out.print("5 ");
				}
				else if(row==2 || row==8 || col==2 || col==8)  
				{
					System.out.print("4 ");
				}
				else if(row==3 || row==7 || col==3 || col==7)  
				{
					System.out.print("3 ");
				}
				else if(row==4 || row==6 || col==4 || col==6)  
				{
					System.out.print("2 ");
				}
				else
				{
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
				
		
	}

}