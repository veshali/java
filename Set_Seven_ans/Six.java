import java.util.*;
class Five
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num,sum,choice,p=0,n=0,z=0;
		sum = 0;
		while( true )
		{
			System.out.print("\n Enter Any Number : ");
			num = sc.nextInt();
			if(num==0)
				z++;
			else if(num<0)
				n++;
			else
				p++;
			System.out.println("\n Press 1 For Another Number ");
			System.out.print(" Enter Your Choice : ");
			choice = sc.nextInt();
			if( choice != 1 )
			{
				break;
			}
		}
		System.out.println("\n no of positive numbers are: " + p );
		System.out.println("\n no of negative numbers are: " + n );
		System.out.println("\n no of zeroes are: " + z );
	}
}