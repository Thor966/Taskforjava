package Gawande;

// Task on iterative statements(for loop)
// sum of first 100 natural number
public class Task30
{
    void meth1()
    {
        int sum =0;
        for(int i=1; i<=100;i++)
        {
            sum =sum+i;
        }
        System.out.println("Sum of first 100 natural numbers are: "+sum);

    }

    public static void main(String[] args)
    {
        new Task30().meth1();
    }
}

