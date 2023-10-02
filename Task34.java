package Gawande;

// Print star pattern
public class Task34
{
    void meth1()
    {
        for(int i=0;i<=5;i++)// i=
        {
            for(int j=0;j<=i;j++) //j=
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args)
    {
         new Task34().meth1();
    }
}
