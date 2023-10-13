package Gawande;

// super keyword and super()
// this keyword and this()

public class Task56_Oops_inhe extends Task55_Oops_inhe
{
    void display()
    {
        System.out.println("Hi");
        super.meth4();
    }

    static int show(int a)
    {
        System.out.println(a+a);
        return a+a++;
    }

    Task56_Oops_inhe ()
    {
        this(show(50));
        for(int i=1;;i++)
        {
            super.meth4();
            break;
        }
        System.out.println("Hi");
        System.out.println(show(50));
    }

    Task56_Oops_inhe (int a)
    {
        System.out.println("====>"+(a++ + show(50)));
    }

    public static void main(String[] args)
    {
        new Task56_Oops_inhe ().display();
    }
}
