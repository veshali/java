
import java.util.*;
class Second
{

public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius of sphere:");
	double r,vol;
	r=sc.nextDouble();
	vol=(4*3.14*r*r*r)/3;
	System.out.println("The volume of sphere is:" +vol);
	
	
}


}