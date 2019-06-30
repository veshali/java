class Ninteen
{
	public static void main(String[]args)
	{
		int[][] a = new int[10][10];
		int i,j,m,n;
		int x=1;
		
		int l=1,r=5,t=1,b=5;
		int d=0;//right
		while(t<=b && l<=r)
		{
		  if(d==0)//right
		  {
			 for(i=l;i<=r;i++)
			 {
				 a[t][i]=x;
				 x++;
			 }
			 d=1;
			 t++;
		  }
		  else if(d==1)//down
		  {
			  for(i=t;i<=b;i++)
			  {
				  a[i][r]=x;
				  x++;
			  }
			  d=2;
			  r--;
		  }
		   else if(d==2)//left
		  {
			  for(i=r;i>=l;i--)
			  {
				  a[b][i]=x;
				  x++;
			  }
			  d=3;
			  b--;
		  }

		   else if(d==3)//up
		  {
			  for(i=b;i>=t;i--)
			  {
				  a[i][l]=x;
				  x++;
			  }
			  d=0;
			  l++;

		  }
		}
		
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				System.out.print( " " + a[i][j] + "  " );
			}
			System.out.println();
		}
	}
}