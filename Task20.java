package Gawande;

// Task on a selection statements
/*
8)Given an integer,n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
 */

public class Task20
{
    void meth1(int n)
    {
        if(n%2==0)
        {
            if(n>=20)
            {
                System.out.println(n +"  not weird");
            }
            else if(n>=6&&n<20)
            {
                System.out.println(n+"  weird");
            }
            else if(n>=2&&n<5)
            {
                System.out.println(n+ "  not weird");
            }
        }
        else
        {
            System.out.println(n+" weird");
        }
    }

    public static void main(String[] args)
    {
        new Task20().meth1(14);
    }
}



