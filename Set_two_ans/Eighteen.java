import java.util.*;
class Eighteen
{

public static void main(String []args)
{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter five digit number:");
			int a,d1,d2,d3,d4,d5,num;
			a=sc.nextInt();
			
			d1=((a%10)+1)%10;
			System.out.println("The new number is:"+d1);
			
			a=a/10;
			d2=((a%10)+1)%10;
			System.out.println("The new number is:"+d2);
			
			a=a/10;
			d3=((a%10)+1)%10;
			System.out.println("The new number is:"+d3);
			
			a=a/10;
			d4=((a%10)+1)%10;
			System.out.println("The new number is:"+d4);
			
			d5=((a/10)+1)%10;
			System.out.println("The new number is:"+d5);
			
			num=d5*10000+d4*1000+d3*100+d2*10+d1;
			
			
			System.out.println("The new number is:"+num);
			
	
}


}