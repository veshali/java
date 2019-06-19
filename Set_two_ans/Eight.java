import java.util.*;
class Eight
{

public static void main(String []args)
{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter marks of student in five subjects:");
			int a,b,c,d,e;
			float agr,per;
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			e=sc.nextInt();

			agr=(a+b+c+d+e)/5;
			per=agr*100;
			System.out.println("The aggregate marks and percentage is:" +agr + per);
			
	
}


}