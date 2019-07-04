import java.util.*;
class ASS2ClassTwo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Operation op = new Operation();
		System.out.print("\n Enter Any Number : ");
		int num = sc.nextInt();
		int temp, div;
		String result =" ";
		
			temp = num;
			div = temp / 1000000;
			if( div != 0 )
			{
				result += op.number_to_word( div ) + " Million";
			}
			temp = temp % 1000000;
			div = temp / 1000;
			if( div != 0 )
			{
				result += op.number_to_word( div ) + " Thousand";
			}
			temp = temp % 1000;
			div = temp / 100;
			if( div != 0 )
			{
				result += op.number_to_word(div) + " Hundred";
			}
			div = temp % 100;
			if( div != 0 )
			{
				result += op.number_to_word(div);
			}
		System.out.println("\n Number in Words \n\n" + result + ".\n");
	}	
}	





class Operation
{
	String number_to_word( int div )
	{
		String[] one_to_nine = {"","One","Two","Three","Four","Five",
		"Six","Seven","Eight","Nine"};
		String[] one_to_ninteen = {"","One","Two","Three","Four","Five",
		"Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen",
		"Forteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
		String[] twenty_to_ninty = {"","","Twenty","Thirty","Forty","Fifty",
		"Sixty","Seventy","Eighty","Ninty"};
		String result = "";
		int d1,d2,d3,d4;
		result += " ";
		
				if( div <20) 
				{
						result += one_to_ninteen[div];					
				}
				
					
				else
				{
					d1 = div / 100;
					d2 = div % 100;
					if( d1 != 0 )
					{
						result += one_to_nine[d1];
						result += " Hundred and ";
					}
					
					if( d2 != 0 )
					{
						result += one_to_ninteen[d2];
					}
						
					else
					{
						d3 = d2 / 10;
						d4 = d2 % 10;
						if( d3 != 0 )
						{
							result += twenty_to_ninty[d3];
						}
						if( d4 != 0 )
						{
							if( d3 != 0 )
							{
								result += " ";
							}
							result += one_to_nine[d4];
						}
					}
				}
				return result;	

	}
}	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
