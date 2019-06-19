class Fifteen
{

public static void main(String []args)
{
		int pop = 80000;
   int popmen,popwomen,poplit,litmen,litwomen,ilitmen,ilitwomen;

    //Calculations
    //population of men
     popmen = (52 * pop) / 100;
   
    //population of women
     popwomen = pop - popmen;
   
    //literate population
     poplit = (48 * pop) / 100;
   
    //literate population of men
    litmen = (35 * pop) / 100;
   
    //literate population of women
     litwomen = poplit - litmen;
   
    //iliterate population of men
    ilitmen = popmen - litmen;
   
    //iliterate population of women
    ilitwomen = popwomen - litwomen;
    
	System.out.println("total number of illiterate men " + ilitmen); 
	System.out.println("total number of illiterate wommen " + ilitwomen);
	}
}