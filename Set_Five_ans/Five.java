class Five
{
public static void main(String[]args)
{
	
	System.out.println("Fibonacci Series is:");
	int f0=0,f1=1,f2=1,f3;
	System.out.print(f0+"\t");
	System.out.print(f1+"\t");
	System.out.print(f2+"\t");
	for(int i=1;i<=15;i++)
	{
		f3=f0+f1+f2;
		System.out.print(f3+"\t");
		f0=f1;
		f1=f2;
		f2=f3;
	}
	
	
	
	
	
	
}
}