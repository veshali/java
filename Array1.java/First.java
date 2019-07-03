import java.util.*;
class First
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		   int []array=new int[10];
		    int loop, largest, second;
			System.out.println("Enter array elements");
			for(loop=0;loop<10;loop++)
		   {
			   array[loop]=sc.nextInt();
		   }
		   if(array[0] > array[1]) 
		   {
			  largest = array[0];
			  second  = array[1];
		   }
		   else
		   {
			  largest = array[1];
			  second  = array[0];
		   }
			
		   for(loop = 2; loop < 10; loop++)
		   {
			  if(largest < array[loop])
			  {
				 second = largest;
				 largest = array[loop];
			  } 
			  else if( second < array[loop] )
			  {
				 second =  array[loop];
			  }
		   }
			System.out.println("Second largest element is:");   
		   System.out.println(second);   
	}
}