import java.util.*;
class Seven
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		int rev=0,d;
		int i=1;
		while(num>0)
		{
			d=num%8;
			rev=rev+(d*i);
			i=i*10;
			num=num/8;
		}
		
		System.out.println(rev);
			
	}
}