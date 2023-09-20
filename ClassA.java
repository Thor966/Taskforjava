package Gawande;

public class ClassA {
    int meth1(int a , String s)
    {
        System.out.println(a);
        System.out.println('a');
        System.out.println(s);
        return 20;
    }

    int meth2()
    {
        System.out.println("meth2() called");
        return 10;
    }

    String meth3()
    {
        System.out.println("meth3() called");
        return "aniket";
    }

    public static void main (String [] args)
    {
     ClassA aobj = new ClassA();

     int i = aobj.meth2();
     String s = aobj.meth3();
     int x = new ClassA().meth1(new ClassA().meth2(), new ClassA().meth3());
        System.out.println(x+i);
        System.out.println(s);
    }
}
