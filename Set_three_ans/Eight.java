import java.util.*;
class Eight
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int yr,diff,lpyrdays,normaldays,res;
    System.out.println("Enter a year whose day of 1st Jan you want to know :");
    yr=sc.nextInt();
   
    yr = (yr - 1) ; //removing 1 year as only 1 day we are calculating of current yr
    lpyrdays =  (yr/4)  + (yr / 400) - (yr / 100 ); //Calculating leap days in that particular year
    normaldays = (yr* 365 )+ 1 + lpyrdays ; //Calculating normal days in that year & adding 1st jan's 1 day in
    res = normaldays % 7;
   
   
    if(res==0)
    System.out.println("Sunday");
    if(res==1)
    System.out.println("Monday");
    if(res==2)
    System.out.println("Tuesday");
    if(res==3)
	System.out.println("Wednesday");
    if(res==4)	
    System.out.println("Thursday");
    if(res==5)
    System.out.println("Friday");
    if(res==6)
    System.out.println("Saturday");
    
}
}
   
   
