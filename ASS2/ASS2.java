import java.util.*;
class ASS2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Any Number : ");
		int num = sc.nextInt();
		int temp, div, d1, d2,d3,d4;
		String result = "";
		temp=num;
			div = temp/ 1000000;
			if( div != 0 )
			{
				result += " ";
				if( div < 20 )
				{
					if( div == 1 )
					{
						result += "One";
					}
					else if( div == 2 )
					{
						result += "Two";
					}
					else if( div == 3 )
					{
						result += "Three";
					}
					else if( div == 4 )
					{
						result += "Four";
					}
					else if( div == 5 )
					{
						result += "Five";
					}
					else if( div == 6 )
					{
						result += "Six";
					}
					else if( div == 7 )
					{
						result += "Seven";
					}
					else if( div == 8 )
					{
						result += "Eight";
					}
					else if( div == 9 )
					{
						result += "Nine";
					}
					else if( div == 10 )
					{
						result += "Ten";
					}
					else if( div == 11 )
					{
						result += "Eleven";
					}
					else if( div == 12 )
					{
						result += "Twelve";
					}
					else if( div == 13 )
					{
						result += "Thirteen";
					}
					else if( div == 14 )
					{
						result += "Forteen";
					}
					else if( div == 15 )
					{
						result += "Fifteen";
					}
					else if( div == 16 )
					{
						result += "Sixteen";
					}
					else if( div == 17 )
					{
						result += "Seventeen";
					}
					else if( div == 18 )
					{
						result += "Eighteen";
					}
					else if( div == 19 )
					{
						result += "Ninteen";
					}
				}
				else
				{
					d1 = div / 100;
					d2 = div % 100;
					if( d1 != 0 )
					{
						if( d1 == 1 )
						{
							result += "One";
						}
						else if( d1 == 2 )
						{
							result += "Two";
						}
						else if( d1 == 3 )
						{
							result += "Three";
						}
						else if( d1 == 4 )
						{
							result += "Four";
						}
						else if( d1 == 5 )
						{
							result += "Five";
						}
						else if( d1 == 6 )
						{
							result += "Six";
						}
						else if( d1 == 7 )
						{
							result += "Seven";
						}
						else if( d1 == 8 )
						{
							result += "Eight";
						}
						else if( d1 == 9 )
						{
							result += "Nine";
						}
						result+=" Hundred and";
					}
					if( d2 <20)
					{
						if( d1 != 0 )
						{
							result += " ";
						}
						if( d2 == 1 )
						{
							result += "One";
						}
						else if( d2 == 2 )
						{
							result += "Two";
						}
						else if( d2 == 3 )
						{
							result += "Three";
						}
						else if( d2 == 4 )
						{
							result += "Four";
						}
						else if( d2 == 5 )
						{
							result += "Five";
						}
						else if( d2 == 6 )
						{
							result += "Six";
						}
						else if( d2 == 7 )
						{
							result += "Seven";
						}
						else if( d2 == 8 )
						{
							result += "Eight";
						}
						else if( d2 == 9 )
						{
							result += "Nine";
						}
						else if( d2 == 10 )
						{
							result += "Ten";
						}
						else if( d2 == 11 )
						{
							result += "Eleven";
						}
						else if( d2 == 12 )
						{
							result += "Twelve";
						}
						else if( d2 == 13 )
						{
							result += "Thirteen";
						}
						else if( d2 == 14 )
						{
							result += "Forteen";
						}
						else if( d2 == 15 )
						{
							result += "Fifteen";
						}
						else if( d2 == 16 )
						{
							result += "Sixteen";
						}
						else if( d2 == 17 )
						{
							result += "Seventeen";
						}
						else if( d2 == 18 )
						{
							result += "Eighteen";
						}
						else if( d2 == 19 )
						{
							result += "Ninteen";
						}
					}
					else
					{
						d3 = d2 / 10;
						d4 = d2 % 10;
						if( d3 != 0 )
						{
							if( d3 == 2 )
							{
								result += "Twenty";
							}
							else if( d3 == 3 )
							{
								result += "Thirty";
							}
							else if( d3 == 4 )
							{
								result += "Fourty";
							}
							else if( d3 == 5 )
							{
								result += "Fifty";
							}
							else if( d3 == 6 )
							{
								result += "Sixty";
							}
							else if( d3 == 7 )
							{
								result += "Seventy";
							}
							else if( d3 == 8 )
							{
								result += "Eighty";
							}
							else if( d3 == 9 )
							{
								result += "Ninty";
							}
						}
						if( d4 != 0 )
						{
							if( d3 != 0 )
							{
								result += " ";
							}
							if( d4 == 1 )
							{
								result += "One";
							}
							else if( d4 == 2 )
							{
								result += "Two";
							}
							else if( d4 == 3 )
							{
								result += "Three";
							}
							else if( d4 == 4 )
							{
								result += "Four";
							}
							else if( d4 == 5 )
							{
								result += "Five";
							}
							else if( d4 == 6 )
							{
								result += "Six";
							}
							else if( d4 == 7 )
							{
								result += "Seven";
							}
							else if( d4 == 8 )
							{
								result += "Eight";
							}
							else if( d4 == 9 )
							{
								result += "Nine";
							}
						}
						
					}
				}
				result += " Million";
			}
			
			
			
			temp = temp % 1000000;
			div = temp / 1000;
			
			if( div != 0 )
			{
				result += " ";
				if( div < 20 )
				{
					if( div == 1 )
					{
						result += "One";
					}
					else if( div == 2 )
					{
						result += "Two";
					}
					else if( div == 3 )
					{
						result += "Three";
					}
					else if( div == 4 )
					{
						result += "Four";
					}
					else if( div == 5 )
					{
						result += "Five";
					}
					else if( div == 6 )
					{
						result += "Six";
					}
					else if( div == 7 )
					{
						result += "Seven";
					}
					else if( div == 8 )
					{
						result += "Eight";
					}
					else if( div == 9 )
					{
						result += "Nine";
					}
					else if( div == 10 )
					{
						result += "Ten";
					}
					else if( div == 11 )
					{
						result += "Eleven";
					}
					else if( div == 12 )
					{
						result += "Twelve";
					}
					else if( div == 13 )
					{
						result += "Thirteen";
					}
					else if( div == 14 )
					{
						result += "Forteen";
					}
					else if( div == 15 )
					{
						result += "Fifteen";
					}
					else if( div == 16 )
					{
						result += "Sixteen";
					}
					else if( div == 17 )
					{
						result += "Seventeen";
					}
					else if( div == 18 )
					{
						result += "Eighteen";
					}
					else if( div == 19 )
					{
						result += "Ninteen";
					}
				}
				else
				{
					d1 = div / 100;
					d2 = div % 100;
					if( d1 != 0 )
					{
						if( d1 == 1 )
						{
							result += "One";
						}
						else if( d1 == 2 )
						{
							result += "Two";
						}
						else if( d1 == 3 )
						{
							result += "Three";
						}
						else if( d1 == 4 )
						{
							result += "Four";
						}
						else if( d1 == 5 )
						{
							result += "Five";
						}
						else if( d1 == 6 )
						{
							result += "Six";
						}
						else if( d1 == 7 )
						{
							result += "Seven";
						}
						else if( d1 == 8 )
						{
							result += "Eight";
						}
						else if( d1 == 9 )
						{
							result += "Nine";
						}
						result+=" Hundred and ";
					}
					if( d2 <20 )
					{
						if( d1 != 0 )
						{
							result += " ";
						}
						if( d2 == 1 )
						{
							result += "One";
						}
						else if( d2 == 2 )
						{
							result += "Two";
						}
						else if( d2 == 3 )
						{
							result += "Three";
						}
						else if( d2 == 4 )
						{
							result += "Four";
						}
						else if( d2 == 5 )
						{
							result += "Five";
						}
						else if( d2 == 6 )
						{
							result += "Six";
						}
						else if( d2 == 7 )
						{
							result += "Seven";
						}
						else if( d2 == 8 )
						{
							result += "Eight";
						}
						else if( d2 == 9 )
						{
							result += "Nine";
						}
						else if( d2 == 10 )
						{
							result += "Ten";
						}
						else if( d2 == 11 )
						{
							result += "Eleven";
						}
						else if( d2 == 12 )
						{
							result += "Twelve";
						}
						else if( d2 == 13 )
						{
							result += "Thirteen";
						}
						else if( d2 == 14 )
						{
							result += "Forteen";
						}
						else if( d2 == 15 )
						{
							result += "Fifteen";
						}
						else if( d2 == 16 )
						{
							result += "Sixteen";
						}
						else if( d2 == 17 )
						{
							result += "Seventeen";
						}
						else if( d2 == 18 )
						{
							result += "Eighteen";
						}
						else if( d2 == 19 )
						{
							result += "Ninteen";
						}
					}
					else
					{
						d3 = d2 / 10;
						d4 = d2 % 10;
						if( d3 != 0 )
						{
							if( d3 == 2 )
							{
								result += "Twenty";
							}
							else if( d3 == 3 )
							{
								result += "Thirty";
							}
							else if( d3 == 4 )
							{
								result += "Fourty";
							}
							else if( d3 == 5 )
							{
								result += "Fifty";
							}
							else if( d3 == 6 )
							{
								result += "Sixty";
							}
							else if( d3 == 7 )
							{
								result += "Seventy";
							}
							else if( d3 == 8 )
							{
								result += "Eighty";
							}
							else if( d3 == 9 )
							{
								result += "Ninty";
							}
						}
						if( d4 != 0 )
						{
							if( d3 != 0 )
							{
								result += " ";
							}
							if( d4 == 1 )
							{
								result += "One";
							}
							else if( d4 == 2 )
							{
								result += "Two";
							}
							else if( d4 == 3 )
							{
								result += "Three";
							}
							else if( d4 == 4 )
							{
								result += "Four";
							}
							else if( d4 == 5 )
							{
								result += "Five";
							}
							else if( d4 == 6 )
							{
								result += "Six";
							}
							else if( d4 == 7 )
							{
								result += "Seven";
							}
							else if( d4 == 8 )
							{
								result += "Eight";
							}
							else if( d4 == 9 )
							{
								result += "Nine";
							}
						}
						
					}
				}
				result += " Thousand";
			
			}
			
			
			temp = temp % 1000;
			div = temp / 100;
			if( div != 0 )
			{
				result += " ";
				if( div < 20 )
				{
					if( div == 1 )
					{
						result += "One";
					}
					else if( div == 2 )
					{
						result += "Two";
					}
					else if( div == 3 )
					{
						result += "Three";
					}
					else if( div == 4 )
					{
						result += "Four";
					}
					else if( div == 5 )
					{
						result += "Five";
					}
					else if( div == 6 )
					{
						result += "Six";
					}
					else if( div == 7 )
					{
						result += "Seven";
					}
					else if( div == 8 )
					{
						result += "Eight";
					}
					else if( div == 9 )
					{
						result += "Nine";
					}
					else if( div == 10 )
					{
						result += "Ten";
					}
					else if( div == 11 )
					{
						result += "Eleven";
					}
					else if( div == 12 )
					{
						result += "Twelve";
					}
					else if( div == 13 )
					{
						result += "Thirteen";
					}
					else if( div == 14 )
					{
						result += "Forteen";
					}
					else if( div == 15 )
					{
						result += "Fifteen";
					}
					else if( div == 16 )
					{
						result += "Sixteen";
					}
					else if( div == 17 )
					{
						result += "Seventeen";
					}
					else if( div == 18 )
					{
						result += "Eighteen";
					}
					else if( div == 19 )
					{
						result += "Ninteen";
					}
				}
				else
				{
					d1 = div / 10;
					d2 = div % 10;
					if( d1 != 0 )
					{
						if( d1 == 2 )
						{
							result += "Twenty";
						}
						else if( d1 == 3 )
						{
							result += "Thirty";
						}
						else if( d1 == 4 )
						{
							result += "Fourty";
						}
						else if( d1 == 5 )
						{
							result += "Fifty";
						}
						else if( d1 == 6 )
						{
							result += "Sixty";
						}
						else if( d1 == 7 )
						{
							result += "Seventy";
						}
						else if( d1 == 8 )
						{
							result += "Eighty";
						}
						else if( d1 == 9 )
						{
							result += "Ninty";
						}
					}
					if( d2 != 0 )
					{
						if( d1 != 0 )
						{
							result += " ";
						}
						if( d2 == 1 )
						{
							result += "One";
						}
						else if( d2 == 2 )
						{
							result += "Two";
						}
						else if( d2 == 3 )
						{
							result += "Three";
						}
						else if( d2 == 4 )
						{
							result += "Four";
						}
						else if( d2 == 5 )
						{
							result += "Five";
						}
						else if( d2 == 6 )
						{
							result += "Six";
						}
						else if( d2 == 7 )
						{
							result += "Seven";
						}
						else if( d2 == 8 )
						{
							result += "Eight";
						}
						else if( d2 == 9 )
						{
							result += "Nine";
						}
					}
				}
				result += " Hundred";
			}
			div = temp % 100;
			if( div != 0 )
			{
				result += " ";
				if( div < 20 )
				{
					if( div == 1 )
					{
						result += "One";
					}
					else if( div == 2 )
					{
						result += "Two";
					}
					else if( div == 3 )
					{
						result += "Three";
					}
					else if( div == 4 )
					{
						result += "Four";
					}
					else if( div == 5 )
					{
						result += "Five";
					}
					else if( div == 6 )
					{
						result += "Six";
					}
					else if( div == 7 )
					{
						result += "Seven";
					}
					else if( div == 8 )
					{
						result += "Eight";
					}
					else if( div == 9 )
					{
						result += "Nine";
					}
					else if( div == 10 )
					{
						result += "Ten";
					}
					else if( div == 11 )
					{
						result += "Eleven";
					}
					else if( div == 12 )
					{
						result += "Twelve";
					}
					else if( div == 13 )
					{
						result += "Thirteen";
					}
					else if( div == 14 )
					{
						result += "Forteen";
					}
					else if( div == 15 )
					{
						result += "Fifteen";
					}
					else if( div == 16 )
					{
						result += "Sixteen";
					}
					else if( div == 17 )
					{
						result += "Seventeen";
					}
					else if( div == 18 )
					{
						result += "Eighteen";
					}
					else if( div == 19 )
					{
						result += "Ninteen";
					}
				}
				else
				{
					d1 = div / 10;
					d2 = div % 10;
					if( d1 != 0 )
					{
						if( d1 == 2 )
						{
							result += "Twenty";
						}
						else if( d1 == 3 )
						{
							result += "Thirty";
						}
						else if( d1 == 4 )
						{
							result += "Fourty";
						}
						else if( d1 == 5 )
						{
							result += "Fifty";
						}
						else if( d1 == 6 )
						{
							result += "Sixty";
						}
						else if( d1 == 7 )
						{
							result += "Seventy";
						}
						else if( d1 == 8 )
						{
							result += "Eighty";
						}
						else if( d1 == 9 )
						{
							result += "Ninty";
						}
					}
					if( d2 != 0 )
					{
						if( d1 != 0 )
						{
							result += " ";
						}
						if( d2 == 1 )
						{
							result += "One";
						}
						else if( d2 == 2 )
						{
							result += "Two";
						}
						else if( d2 == 3 )
						{
							result += "Three";
						}
						else if( d2 == 4 )
						{
							result += "Four";
						}
						else if( d2 == 5 )
						{
							result += "Five";
						}
						else if( d2 == 6 )
						{
							result += "Six";
						}
						else if( d2 == 7 )
						{
							result += "Seven";
						}
						else if( d2 == 8 )
						{
							result += "Eight";
						}
						else if( d2 == 9 )
						{
							result += "Nine";
						}
					}
				}
			}

			
		System.out.println("\n Number in Words \n" + result + ".\n");
	}
}