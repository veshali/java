import java.util.*;
class Sixteen
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int x,y;
	System.out.println("Enter co-ordinates:");
	x=sc.nextInt();
	y=sc.nextInt();
	if(x==0 && y==0)
		System.out.println("Given point lies at origin");
	else if(x==0 && y!=0)
		System.out.println("Given point lies on the y-axis");
	else
		System.out.println("Given points lies on the x-axis");
}
}