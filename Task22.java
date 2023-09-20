package Gawande;

//Task on selection statements

/*
Create a Java program that checks if a given year is a leap year or not.
 */
public class Task22
{
    void leapyear(int year)
    {
        if(year%4==0)
        {
            System.out.println(year +" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
    }

    public static void main(String[] args)
    {
            new Task22().leapyear(2028);
    }
}
