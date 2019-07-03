import java.util.*;
class Second
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		   int []array=new int[11];
		   int [] b=new int[11];
			
		    int loop;
			System.out.println("Enter array elements:");
			for(loop=1;loop<=10;loop++)
		    {
			   array[loop]=sc.nextInt();
			   b[array[loop]]++;
		    }
			System.out.println("\nArray elements are:");
			for(loop=1;loop<=10;loop++)
		    {
			   System.out.println(b[loop]);
		    } 
			int max=0,j=0;
			for(loop=1;loop<=10;loop++)
		    {
				if(max<b[loop])
				{
					max=b[loop];
					j=loop;
				}
		    }
			System.out.println("Maximum frequency:");
			System.out.println(max);
			System.out.println("Element having maximum frequency:");
			System.out.println(j);
			System.out.println("Elements having same frequency in insertion order:");
			for(loop=1;loop<=10;loop++)
		    {
				if(max==b[loop])
				{
					System.out.print(loop+" ");
				}
		    }
	}
}