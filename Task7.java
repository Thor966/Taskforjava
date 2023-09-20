package Gawande;

// Task6 on static keyword

public class Task7
{
    static int x = 100;

    static
    {
        System.out.println("x :"+x);
        System.exit(0);  // It is used to terminate the program
    }

    public static void main(String[] args)
    {
        System.out.println("main method");
    }
}
