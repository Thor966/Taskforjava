package Gawande;

// Task on iterative statement(for loop)
// Printing the tables
public class Task29
{
    void meth1(int num)
    {
        for(int i =1;i<=10;i++)
        {
            System.out.println(num + "*" + i + " = " + (num*i));
        }
    }
    public static void main(String[] args)
    {
        new Task29().meth1(30);
    }

}
