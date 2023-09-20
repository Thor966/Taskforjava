package Gawande;

// Task 4 on static variable
public class Task5
{
    static int x = 10; //20 now value of x = 20

    public static void main(String[] args)
    {
        Task5 t1 = new Task5();
        Task5 t2 = new Task5();

        t1.x =20;
        System.out.print(x + " "); //20
        System.out.println(t2.x); //20
    }
}
