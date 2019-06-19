import java.util.*;
class Seventeen
{

public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int SP,P,CP,sp,p;
	int item=15;
	System.out.println("Enter the total selling price:");
	SP=sc.nextInt();
	System.out.println("Enter the total profit earned:");
	P=sc.nextInt();
	sp=SP/item;
	p=P/item;
	CP=sp-p;


	
	System.out.println("Cost price of each item:" + CP);
	}
}