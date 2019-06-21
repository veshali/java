import java.util.*;
class Third
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int a,pa;
	String h,s,l;
	String h1="Excellent",h2="Poor",l1="City",l2="Village",s1="Male",s2="Female";
	System.out.println("Enter a Person health:");
	h=sc.next();
	int H=h.compareTo(h1);
	int HH=h.compareTo(h2);
	System.out.println("Enter a Person sex:");
	s=sc.next();
	int S=s.compareTo(s1);
	int SS=s.compareTo(s2);
	System.out.println("Enter a Person age:");
	a=sc.nextInt();
	System.out.println("Enter a Person policy amount:");
	pa=sc.nextInt();
	System.out.println("Enter a Person living place:");
	l=sc.next();
	int L=l.compareTo(l1);
	int LL=l.compareTo(l2);
	if((H==0)&&(a>=25 && a<=35)&&(S==0)&&(pa<=200000)&&(L==0))
	{
		System.out.println("The person is insured and premium is 4 per thousand");
	}
	else if((H==0)&&(a>=25 && a<=35)&&(SS==0)&&(pa<=100000)&&(L==0))
	{
		System.out.println("The person is insured and premium is 1 per thousand");
	}
	else if((HH==0)&&(a>=25 && a<=35)&&(S==0)&&(pa<=10000)&&(LL==0))
	{
		System.out.println("The person is insured and premium is 6 per thousand");
	}
	else
	{
		System.out.println("The person is not insured");
	}
	
}
}