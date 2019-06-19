import java.util.*;
class Thirteen
{

public static void main(String []args)
{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter five digit number:");
			int a,d1,d2,d3,d4,d5,rev;
			a=sc.nextInt();
			
			d1=a%10;
			a=a/10;
			d2=a%10;
			a=a/10;
			d3=a%10;
			a=a/10;
			d4=a%10;
			d5=a/10;
			rev=d1*10000+d2*1000+d3*100+d4*10+d5;
			
			
			System.out.println("The sum of five digit number is:"+rev);
			
	
}


}