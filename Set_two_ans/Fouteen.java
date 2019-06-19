import java.util.*;
class Fouteen
{

public static void main(String []args)
{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter four digit number:");
			int a,d1,d2,d3,d4,sum;
			a=sc.nextInt();
			
			d1=a%10;
			a=a/10;
			d2=a%10;
			a=a/10;
			d3=a%10;
			d4=a/10;
			
			sum=d1+d4;
			
			
			System.out.println("The sum of first and last digit of a four digit number is:"+sum);
			
	
}


}