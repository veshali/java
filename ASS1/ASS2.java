import java.util.*;
class ASS2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Any Number : ");
		int num = sc.nextInt();
		int temp, div, d1, d2, d3, d4;
		String result = "";
		
			temp = num;
			div = temp / 100000000;
			if( div != 0 )
			{
				result += " ";
				if( div <=9) 
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
						
					}
					result += " Hundred";

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
				
			result+=" Million ";			
			}			
			
		System.out.println("\n Number in Words \n" + result + ".\n");
	}
}