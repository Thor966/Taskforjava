package Gawande;

// Task on iterative statement(without any loop)
// without loop printing 1 to 100 numbers
public class Task33
{
    static int a = 1;
    void meth1()
    {
       if(a<=100)
       {
           System.out.println(a);
           ++a;
           new Task33().meth1();// it is called recursion
       }

    }

    public static void main(String[] args)
    {
        new Task33().meth1();
    }
}
