import java.util.*;
class Eight
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num,choice;
		int large=-999,small=999;
		while( true )
		{
			System.out.print("\n Enter Any Number : ");
			num = sc.nextInt();
			if(num>large)
				large=num;
			if(num<small)
				small=num;
			System.out.println("\n Press 1 For Another Number ");
			System.out.print(" Enter Your Choice : ");
			choice = sc.nextInt();
			if( choice != 1 )
			{
				break;
			}
		}
		System.out.println("\n Largest number is: " + large );
		
		System.out.println("\n Smallest number is: " + small );
	}
}