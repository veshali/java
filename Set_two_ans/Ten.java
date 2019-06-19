import java.util.*;
class Ten
{

public static void main(String []args)
{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter lenghth and breath of a rctangle :");
			double l,b,r,a,p,A,P;
			l=sc.nextDouble();
			b=sc.nextDouble();
			System.out.println("Enter radius of a circle:");
			r=sc.nextDouble();
			
			a=l*b;
			p=2*(l+b);
			A=3.14*r*r;
			P=2*3.14*r;
			
			System.out.println("The area of a rectangle is:"+a);
			System.out.println("The perimeter of a rectangle is:"+p);
			System.out.println("The area of a circle is:"+A);
			System.out.println("The perimeter of a circle is:"+P);
	
}


}