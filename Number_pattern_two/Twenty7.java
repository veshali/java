class Twenty7
{
	public static void main(String[] args)
	{
		int [][] a=new int[10][10];
		int i,j;
		int l=1,r=5,t=1,b=5;
		int d=0;//right
		int value=1;
		while(t<=b && l<=r)
		{
		  if(d==0)
		  {
			 for(i=l;i<=r;i++)
			 {
				 a[t][i]=value;
				 value++;
			}
			 d=1;
			 t++;
		  }
		  else if(d==1)//down
			{
			  for(i=t;i<=b;i++)
			  {
				 a[i][r]=value;
				 value++;
			  }
			  d=2;
			  r--;
			}
		   else if(d==2)//left
			{
			  for(i=r;i>=l;i--)
			  {
				 a[b][i]=value;
				 value++;
			  }
			  d=3;
			  b--;
			}

		   else if(d==3)//up
			{
			  for(i=b;i>=t;i--)
			  {
				  a[i][l]=value;
				  value++;
			  }
			  d=0;
			  l++;
			}
		}
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5) 
				{
					System.out.print(a[i][j]);
					if(a[i][j]<9)
						System.out.print("   ");
					else if(a[i][j]<99)
						System.out.print("  ");
					else
						System.out.print(" ");
				}
				
				else
					System.out.print("    ");
			}
			System.out.println();
		}



	}
}


















