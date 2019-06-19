import java.util.*;
class Sixteen
{

public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int hundred,fifty,ten,amount;
	System.out.println("Enter the amount:");
	amount=sc.nextInt();
	hundred=amount/100;
	amount=amount%100;
	fifty=amount/50;
	amount=amount%50;
	ten=amount/10;	
	System.out.println("No.of hundred rupee notes:" + hundred); 
	System.out.println("No.of fifity rupee notes:" + fifty);
	System.out.println("No.of ten rupee notes:" + ten);
	
	}
}