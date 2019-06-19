import java.util.*;
class Eleven
{

public static void main(String []args)
{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1st number at locaton at C:");
			int a,b,temp;
			a=sc.nextInt();
			System.out.println("Enter 2nd number at location at D:");
			b=sc.nextInt();
			
			temp=a;
			a=b;
			b=temp;
			
			System.out.println("The 1st number is:"+a);
			System.out.println("The 2nd number is:"+b);
			
	
}


}