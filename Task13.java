package Gawande;
// Task on selection statements

// 1) WAP Take a parameterized constructor with two int values and print greatest among them.
public class Task13
{

    Task13(int a, int b)
    {
        if(a>b)
        {
            System.out.println(a +" " + "is greater");
        }
        else
        {
            System.out.println(b+" "+ "is greater");
        }
    }

    public static void main(String[] args)
    {
            new Task13(2,10);
    }
}
