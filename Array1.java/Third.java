import java.util.*;
class Third
{
	public static void main(String[] args)
	{
		
		Insertion obj=new Insertion();
		obj.Insertion();
		Insertion del=new Insertion();
		del.Deletion();
		Insertion Sedel=new Insertion();
		Sedel.SearchDeletion();
		Insertion dup=new Insertion();
		dup.Duplicate();
		Insertion rem=new Insertion();
		rem.GivenDuplicate();
		 
	}
}
class Insertion
{
	void Insertion()
	{
	  int []array=new int[7];
	
			Scanner sc=new Scanner(System.in);
		    int loop,i;
			System.out.println("\nEnter array elements");
			for(loop=1;loop<=5;loop++)
		    {
			   array[loop]=sc.nextInt();
		    }
			System.out.println("\narray elements are:");
			for(loop=1;loop<=5;loop++)
		    {
			   System.out.print(array[loop]+" ");
		    } 
			System.out.println("\nEnter position where element is inserted");
			int p=sc.nextInt();
			System.out.println("\nEnter element to be inserted");
			int elem=sc.nextInt();
			for(i=5;i>=p;i--)
			{
				array[i+1]=array[i];
			}
			array[p]=elem;
			System.out.println("\nAfter insertion,array becomes:");
			for(loop=1;loop<=6;loop++)
		    {
			   System.out.print(array[loop]+" ");
		    }
	}


		void Deletion()
		{
			int []array=new int[7];
	
			Scanner sc=new Scanner(System.in);
		    int loop,i;
			System.out.println("\nEnter array elements");
			for(loop=1;loop<=5;loop++)
		    {
			   array[loop]=sc.nextInt();
		    }
			System.out.println("\narray elements are:");
			for(loop=1;loop<=5;loop++)
		    {
			   System.out.print(array[loop]+" ");
		    } 
			System.out.println("\nEnter position from where element should be deleted:");
			int p=sc.nextInt();
			for(i=p;i<=5;i++)
			{
				array[i]=array[i+1];
			}
			System.out.println("\nAfter Deletion,array becomes:");
			for(loop=1;loop<=4;loop++)
		    {
			   System.out.print(array[loop]+" ");
		    }
		}


			void SearchDeletion()
			{
				int []array=new int[7];
		
				Scanner sc=new Scanner(System.in);
				int loop,i;
				System.out.println("\nEnter array elements");
				for(loop=1;loop<=5;loop++)
				{
				   array[loop]=sc.nextInt();
				}
				System.out.println("\narray elements are:");
				for(loop=1;loop<=5;loop++)
				{
				   System.out.print(array[loop]+" ");
				} 
				System.out.println("\nEnter Element to be deleted");
				int ele=sc.nextInt();
				int p=0;
				int flag=0;
				for(i=1;i<=5;i++)
				{
					if(array[i]==ele)
					{
						p=i;
					}
					else
					{
						flag=1;
					}
					
				}
				if(flag==0)
				{
					for(i=p;i<=5;i++)
					{
						array[i]=array[i+1];
					}
					System.out.println("\nAfter Deletion of given element,array will be:");
					for(loop=1;loop<=4;loop++)
					{
					   System.out.print(array[loop]+" ");
					}
				}
				else
				{
					System.out.println("\nElement not found");
				}

			}
	
			void Duplicate()
			{
				Scanner sc=new Scanner(System.in);
				int loop,i;
				int n=6;
				int []array=new int[20];
				System.out.println("\nEnter array elements");
				for(loop=0;loop<n;loop++)
				{
				   array[loop]=sc.nextInt();
				}
				System.out.println("\narray elements are:");
				for(loop=0;loop<n;loop++)
				{
				   System.out.print(array[loop]+" ");
				} 
				int j=0,k;
				for(i=0;i<n;i++)
				{
					for(j=i+1;j<n; )
					{
						if(array[j]==array[i])
						{
							for(k=j;k<n;k++)
							{
								array[k]=array[k+1];
							}
							n--;
						}
						else
						{
							j++;
						}
					}
				}
				System.out.println("\nAfter removal of duplicate elements,array will be:");
				for(loop=0;loop<n;loop++)
				{
				   System.out.print(array[loop]+" ");
				}

			}
			
			
			
			
			
			void GivenDuplicate()
			{
				Scanner sc=new Scanner(System.in);
				int loop,i;
				int n=6;
				int []array=new int[20];
				
				System.out.println("\nEnter array elements");
				for(loop=0;loop<n;loop++)
				{
				   array[loop]=sc.nextInt();
				}
				System.out.println("array:");
				for(loop=0;loop<n;loop++)
				{
				   System.out.print(array[loop]+" ");
				} 
				System.out.println("\nEnter element");
				int ele=sc.nextInt();
				int index=0;
				for(i=0;i<n;i++)
				{
					if(array[i]!=ele)
					{
						array[index++]=array[i];
					}
				}
				for(loop=0;loop<index;loop++)
				{
				   System.out.print(array[loop]+" ");
				}

			}
}