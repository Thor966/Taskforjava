package Gawande;

// Task on this keyword
public class Task37
{
    public int meth1(int a, int b)
    {
        System.out.println("meth1() called");
        System.out.println(b);
        System.out.println(100);
        return (a+b)+10+(a-b);
    }

    public int meth2()
    {
        System.out.println("meth2() called");
       return this.meth3()+8;
    }

    public Task37()
    {
        this("Java is awesome");
        System.out.println(50);

    }

    int meth3()
    {
        System.out.println("meth3() called");
        return 10;
    }

    public String meth4(int a,String s)
    {
        System.out.println("meth4() called");
        a = a+4;
        System.out.println("a values ====> "+a);
        System.out.println("s values ====> "+s);

        return s+"  is object orianted programming languages";
    }
    public int meth5(int a)
    {
        System.out.println("meth5() called");
        return 10-a;
    }

    public Task37(String s)
    {
        String result = this.meth4(this.meth1(this.meth2(),this.meth5(5)+('A')-('a')),s);
        System.out.println(result);
        System.out.println(s);

    }

    public static void main(String[] args)
    {
        new Task37();

    }
}
