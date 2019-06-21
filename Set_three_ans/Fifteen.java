import java.util.*;
class Fifteen
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int x1,y1,cx,cy,r;
	System.out.println("Enter 1st co-ordinates:");
	x1=sc.nextInt();
	y1=sc.nextInt();
	System.out.println("Enter Center of circle:");
	cx=sc.nextInt();
	cy=sc.nextInt();
	System.out.println("Enter radius:");
	r=sc.nextInt();
	if(((cx-x1)*(cx-x1)+(cy-y1)*(cy-y1))<(r*r))
		System.out.println("Given points lies inside the circle");
	else if(((cx-x1)*(cx-x1)+(cy-y1)*(cy-y1))<(r*r))
		System.out.println("Given points lies on the circle");
	else
		System.out.println("Given points lies outside the circle");
}
}