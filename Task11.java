package Gawande;

// Task on type casting
public class Task11
{
    void implicit()
    {
        byte b = 10;
        System.out.println("byte value is : "+ b);
        short s = b;
        System.out.println("short value is :"+s);
        s++;
        int i = s++;
        System.out.println("int value is :"+ i);
        System.out.println("short value is :"+ s);
        long l = i;
        System.out.println("long value is :"+l);
        float f = l;
        System.out.println("'the value of float is :"+(f+b));
        double d = --f;
        System.out.println("the value of double is :"+d);
        show();
        if(!(d==f))
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }

    }

    public static void main(String[] args)
    {
               new Task11().implicit();
    }

    static void show()
    {
        char c = 'A';
        int a = ++c;
        System.out.println(a);
          Task11 obj = new Task11();
          String s = obj.meth1();
        System.out.println(s);

    }

    String meth1()
    {
        String s = "Implicit casting done by the compiler";
        return s;
    }
}
