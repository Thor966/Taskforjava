package Gawande;

public class ClassC
{
    public static void main(String [] args)
    {
        int a =34;
        int b= 21;
        int c = a++ + ++b;
        System.out.println("c" +c);
        int d = --a + --b + c--;
        System.out.println("d" +d);
        int e = a + +b + +c + d--;
        System.out.println("e" +e);
        int f = -a + b-- + -c -d++;
        System.out.println("f" +f);
        int sum = a+b+c+d+e+f;
        System.out.println("sum :"+ sum);
    }
}
