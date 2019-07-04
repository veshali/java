import java.util.*;
class ASS2_Class
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Operation op = new Operation();
		System.out.print("\n Enter Any Number : ");
		int num = sc.nextInt();
		int temp, div;
		String result = "";
		
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
		String result = "";
		int d1,d2,d3,d4;
		result += " ";
		
		if( div <20) 
			{
					switch( div )
					{
						case 1:
							result += "One";
							break;
						case 2:
							result += "Two";
							break;
						case 3:
							result += "Three";
							break;
						case 4:
							result += "Four";
							break;
						case 5:
							result += "Five";
							break;
						case 6:
							result += "Six";
							break;
						case 7:
							result += "Seven";
							break;
						case 8:
							result += "Eight";
							break;
						case 9:
							result += "Nine";
							break;
						case 10:
							result += "Ten";
							break;
						case 11:
							result += "Eleven";
							break;
						case 12:
							result += "Twelve";
							break;
						case 13:
							result += "Thirteen";
							break;
						case 14:
							result += "Forteen";
							break;
						case 15:
							result += "Fifteen";
							break;
						case 16:
							result += "Sixteen";
							break;
						case 17:
							result += "Seventeen";
							break;
						case 18:
							result += "Eighteen";
							break;
						case 19:
							result += "Ninteen";
							break;	
						
					}
					
			}
				
					
				else
				{
					d1 = div / 100;
					d2 = div % 100;
					if( d1 != 0 )
					{
						switch( d1 )
						{
							case 1:
								result += "One";
								break;
							case 2:
								result += "Two";
								break;
							case 3:
								result += "Three";
								break;
							case 4:
								result += "Four";
								break;
							case 5:
								result += "Five";
								break;
							case 6:
								result += "Six";
								break;
							case 7:
								result += "Seven";
								break;
							case 8:
								result += "Eight";
								break;
							case 9:
								result += "Nine";
								break;
													
						}
						result += " Hundred and ";

					}
					
					if( d2 != 0 )
					{
						if(d2<19)
						{
							switch( d2 )
							{
								case 1:
									result += "One";
									break;
								case 2:
									result += "Two";
									break;
								case 3:
									result += "Three";
									break;
								case 4:
									result += "Four";
									break;
								case 5:
									result += "Five";
									break;
								case 6:
									result += "Six";
									break;
								case 7:
									result += "Seven";
									break;
								case 8:
									result += "Eight";
									break;
								case 9:
									result += "Nine";
									break;
								case 10:
									result += "Ten";
									break;
								case 11:
									result += "Eleven";
									break;
								case 12:
									result += "Twelve";
									break;
								case 13:
									result += "Thirteen";
									break;
								case 14:
									result += "Forteen";
									break;
								case 15:
									result += "Fifteen";
									break;
								case 16:
									result += "Sixteen";
									break;
								case 17:
									result += "Seventeen";
									break;
								case 18:
									result += "Eighteen";
									break;
								case 19:
									result += "Ninteen";
									break;
							}
						}
						
						else
						{
							d3 = d2 / 10;
							d4 = d2 % 10;
							if( d3 != 0 )
							{
								switch( d3 )
								{
									case 2:
										result += "Twenty";
										break;
									case 3:
										result += "Thirty";
										break;
									case 4:
										result += "Fourty";
										break;
									case 5:
										result += "Fifty";
										break;
									case 6:
										result += "Sixty";
										break;
									case 7:
										result += "Seventy";
										break;
									case 8:
										result += "Eighty";
										break;
									case 9:
										result += "Ninty";
										break;
								}
							}
							if( d4 != 0 )
							{
								if( d3 != 0 )
								{
									result += " ";
								}
								switch( d4 )
								{
									case 1:
										result += "One";
										break;
									case 2:
										result += "Two";
										break;
									case 3:
										result += "Three";
										break;
									case 4:
										result += "Four";
										break;
									case 5:
										result += "Five";
										break;
									case 6:
										result += "Six";
										break;
									case 7:
										result += "Seven";
										break;
									case 8:
										result += "Eight";
										break;
									case 9:
										result += "Nine";
										break;
								}
							}
						}
					}
				}
				return result;	
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
