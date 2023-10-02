package Gawande;

// Task on iterative statement(for loop)
// print even numbers between 1 to 20.
public class Task31
{
    void meth1()
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args)
    {
        new Task31().meth1();
    }
}
