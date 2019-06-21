import java.util.*;
class Six
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int sp,cp,pf;
	System.out.println("Enter Cost price:");
	cp=sc.nextInt();
	System.out.println("Enter Selling price:");
	sp=sc.nextInt();
	if(sp>cp)
	{
		pf=sp-cp;
		System.out.println("He incurred profit of : "+pf);
	}
	else
	{
		pf=cp-sp;
		System.out.println("He incurred loss of : "+pf);
	}
	
}
}