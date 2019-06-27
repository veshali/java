class Sixteen
{

public static void main(String[]args)
{
    int row, col, space;
    for(row=1;row<=5;row++)
    {
        for(col=1;col<=row;col++)
        {
            System.out.print("*");
        }
       System.out.println();
    }
    for(row=4;row>=1;row--)
    {
        for(col=1;col<=row;col++)
        {
           System.out.print("*");
        }
        System.out.println();
    }

}
}

