
import java.util.*;
class Sixth
{

public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int sal,da,hr,gs;
	System.out.println("Enter salary of ramesh:");
	sal=sc.nextInt();
	da=(sal*40)/100;
	hr=(sal*20)/100;
	gs=sal+da+hr;
	System.out.println("Gross salary of Ramesh is:"+gs);
	
	
}


}