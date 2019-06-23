import java.util.*;
class Five
{
			public static void main(String[]args)
			{
					Scanner sc=new Scanner(System.in);	
						
							int matchsticks=21, user, computer;

							System.out.println("Do not enter Invalid Numbers.\nNumbers above 4 are invalid.");

							System.out.println("If you do so, the computer automatically wins.");

							while (matchsticks>=1)
							{

								System.out.println("Number of matchsticks available right now is: " + matchsticks);

								System.out.println("Your Turn...");

								System.out.println("\nPick up the matchstick(s)-- (1-4): ");
								user=sc.nextInt();

								if (user>4)

								{
								System.out.println("Invalid Selection");
								break;
								}

								computer=5-user;

								System.out.println("Computer's Turn.." );
								System.out.println("Computer chooses: " +computer);

								matchsticks=matchsticks-user-computer;
								continue;

							
							}
							
														
			
							System.out.println("Computer Wins");
					
			}

}