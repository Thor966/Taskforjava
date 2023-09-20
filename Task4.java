package Gawande;
 // Task 3 on static keyword
public class Task4
{
    int x =10;

    public static void main(String[] args)
    {
       // System.out.println(Task4().x); // get an error because
        // we cant access instance variable through classname
    }

    static
    {
        int x =20;
        System.out.print(x + " ");
    }
}
