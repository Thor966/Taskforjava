package Gawande;

// Task8 on static keyword
public class Task9
{
    static int a = 0; // 1st static variable have executing
    int b =0;

    Task9() // 3rd constructor
    {
        a++;
        b++;
        System.out.println("static variable ====>"+a);
        System.out.println("Instance variable ====>"+b);
        System.out.println("--------------------------------");
    }

    void display() // 4th display()
    {
        System.out.println("***** Accessing static variable *****");
        System.out.println(Task9.a);
        System.out.println(a);
        System.out.println(new Task9().a);
    }

    public static void main(String[] args) // 2nd main()
    {
        new Task9();
        new Task9();
        new Task9();
        System.out.println("##################");
        new Task9().display();
    }


}
