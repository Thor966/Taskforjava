package Gawande;

public class ClassF
{
    int display(int a)
    {
        System.out.println(10);
        System.out.println(new ClassF().meth1(10,2));
        System.out.println("Krishna is good man ");
        return a;
    }
    int show()
    {
        System.out.println(20);
        return new ClassF().display(100);
    }
    int meth1(int x,int y)
    {
        System.out.println(new ClassF().math5("paven"));
        return x+y;
    }
    int math2( int x)
    {
        return x*2;
    }
    int math3( int x, int y, int z)
    {
        System.out.println("java is awesome");
        return x+y+z;
    }
    int math4()
    {
        System.out.println(new ClassF().math5(null));
        return 5;
    }
    String math5(String s)
    {
        return "om";
    }
    public static void main(String[] args)
    {
        int a=10;
        ClassF bobj = new ClassF();

        System.out.println(bobj.display(bobj.meth1(49,1)+
                bobj.math2(10)-bobj.math3(10,10,5)*bobj.math2(a) +
                10-bobj.math4())+bobj.math3(10, 7, a));

        System.out.println(new ClassF().show()+bobj.math5(null));
    }
}

