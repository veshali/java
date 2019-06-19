
import java.util.*;
class Seven
{

public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	double km,m,feet,inch,cm;
	System.out.println("Enter distance between two cities in killometers:");
	km=sc.nextDouble();
	
	 m = km*1000; //since 1km = 1000m
	feet= km*3280.84; //since 1km=3280.84feet
	inch=km*39370.1; //since 1 km=39370.1inches
	cm=km*100000; 
	System.out.println("Distance in meter is:"+m);
	System.out.println("Distance in feet is:"+feet);
	System.out.println("Distance in inch is:"+inch);
	System.out.println("Distance in centimeter is:"+cm);
	
}


}