import java.util.*;
class Fourteen
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	float x1,x2,x3,y1,y2,y3;
	System.out.println("Enter 1st co-ordinates:");
	x1=sc.nextFloat();
	y1=sc.nextFloat();
	System.out.println("Enter 2nd co-ordinates:");
	x2=sc.nextFloat();
	y2=sc.nextFloat();
	System.out.println("Enter 3rd co-ordinates:");
	x3=sc.nextFloat();
	y3=sc.nextFloat();
	float slope1=(y2-y1)/(x2-x1);
	float slope2=(y3-y2)/(x3-x2);
	if(slope1==slope2)
		System.out.println("Given points on a straight line");
	else
		System.out.println("Given points are not on a straight line");
}
}