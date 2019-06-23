import java.util.*;
class Seven
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
	int a,b;
	a=sc.nextInt();
	System.out.println("Enter first number:");
	b=sc.nextInt();
	int hcf,lcm;
	int x=a,y=b;
	while(y!=0)
	{
		int t=y;
		y=x%y;
		x=t;
	}
	hcf=x;
	lcm=(a*b)/hcf;
	System.out.println("HCF of two given numbers is: "+hcf);
	System.out.println("LCM of two given numbers is: "+lcm);
	
}
}