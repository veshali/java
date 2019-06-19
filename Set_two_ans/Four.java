
import java.util.*;
class Four
{

public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter minutes:");
	int m,h;
	m=sc.nextInt();
	h=m/60;
	m=m%60;
	System.out.println( h + " hour and " + m +" minutes");
	
	
}


}