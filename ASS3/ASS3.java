import java.util.*;
class ASS3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int year, totaldays, rem,ans;
		System.out.println("\nEnter date : ");
		int d,n;
		n=sc.nextInt();
		d=n;
		d=d-1;
		System.out.println("\nEnter month : ");
		int mon;
		int m=28;
		mon=sc.nextInt();
		System.out.print("\nEnter Year : ");
		year = sc.nextInt();
		// Normal Year :- 365 Days = 52 Weeks + 1 Day
		// Leap Year :- 366 Days = 52 Weeks + 2 Day
		totaldays = ( year - 1 ) * 365;
		totaldays += ( year - 1 ) / 4;
		totaldays -= ( year - 1 ) / 100;
		totaldays += ( year - 1 ) / 400;
		ans=totaldays;
		if(((year%4==0)||(year%400==0))&&(year%100!=0))
		{
			m=29;
		}
		switch(mon)
		{
			case 1:
				ans=ans+d;
				break;
			case 2:
				ans=ans+d+31;
				break;
			case 3:
				ans=ans+d+31+m;
				break;
			case 4:
				ans=ans+d+31+m+31;
				break;
			case 5:
				ans=ans+d+31+m+31+30;
				break;
			case 6:
				ans=ans+d+31+m+31+30+31;
				break;
			case 7:
				ans=ans+d+31+m+31+30+31+30;
				break;
			case 8:
				ans=ans+d+31+m+31+30+31+30+31;
				break;
			case 9:
				ans=ans+d+31+m+31+30+31+30+31+31;
				break;
			case 10:
				ans=ans+d+31+m+31+30+31+30+31+31+30;
				break;
			case 11:
				ans=ans+d+31+m+31+30+31+30+31+31+30+31;
				break;
			case 12:
				ans=ans+d+31+m+31+30+31+30+31+31+30+31+30;
				break;
		}
		rem=ans%7;
		String result = "\n On " + n + "/" + mon + "/" + year + " has ";
		if( rem == 0 )
		{
			result += "Monday";
		}
		else if( rem == 1 )
		{
			result += "Tuesday";
		}
		else if( rem == 2 )
		{
			result += "Wednesday";
		}
		else if( rem == 3 )
		{
			result += "Thursday";
		}
		else if( rem == 4 )
		{
			result += "Friday";
		}
		else if( rem == 5 )
		{
			result += "Saturday";
		}
		else
		{
			result += "Sunday";
		}
		result += ".";
		System.out.println( result );		
	}
}