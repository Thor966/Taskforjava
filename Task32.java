package Gawande;

//Task on iterative statement (for loop)
// write a java program to find the factorial
public class Task32
{
    void meth1(int num)
    {
        int factorial = 1;
        for(int i=1;i<=num;i++)
        {
            factorial = factorial*i;
        }
        System.out.println("Factorial "+factorial);
    }

    public static void main(String[] args)
    {
        new Task32().meth1(10); // in 55 its reaching the limit of int
    }

}
