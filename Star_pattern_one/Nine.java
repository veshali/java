class Nine
{

public static void main(String[]args)
{
    int row, col, space;
    for(row=1;row<=5;row++)
    {
        for(col=1;col<=6-row;col++)
        {
            System.out.print("*");
        }
        for(space=1;space<row;space++)
        {
            System.out.print("  ");
        }
        for(col=1;col<=6-row;col++)
        {
           System.out.print("*");
        }
       System.out.println();
    }
    for(row=2;row<=5;row++)
    {
        for(col=1;col<=row;col++)
        {
           System.out.print("*");
        }
        for(space=1;space<=5-row;space++)
        {
            System.out.print("  ");
        }
        for(col=1;col<=row;col++)
        {
           System.out.print("*");
        }
        System.out.println();
    }

}
}

