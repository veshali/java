import java.util.*;
class Nine
{

public static void main(String []args)
{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter temperature in fahernhite:");
			double f,c;
			f=sc.nextDouble();
			
			c=0.55*(f-32.0);
			
			System.out.println("The temperature in celsius is:"+c);
			
	
}


}