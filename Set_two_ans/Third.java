
import java.util.*;
class Third
{

public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter hours and minutes:");
	int h,m;
	h=sc.nextInt();
	m=sc.nextInt();
	m=(h*60)+m;
	System.out.println("Total minutes are:" +m);
	
	
}


}