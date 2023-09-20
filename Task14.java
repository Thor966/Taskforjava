package Gawande;

// Task on selection ststements

// 2) WAP Take a parameterized meth with three int values and print greatest among them.
public class Task14
{

    void meth1(int a, int b, int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+ " "+"a is biggest");
            }
            else
            {
                System.out.println(b+" "+"b is biggest");
            }
        }
        else
        {
            if(b>c) // 100>500
            {
                System.out.println(b+" "+"b is biggest");
            }
            else
            {
                System.out.println(c+" "+"c is biggest");
            }
        }

    }

    public static void main(String[] args)
    {
        new Task14().meth1(500,1000,50);
    }
}
