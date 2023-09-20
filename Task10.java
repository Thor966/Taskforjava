package Gawande;

public class Task10
{
    int c;
    static int e;

    Task10()
    {
        System.out.println(++c);
        System.out.println(++e);
    }

    public static void main(String[] args)
    {
     int a =34;
     int b =21;
     new Task10().c-= a++ + ++b;
     int d = --a + --b + new Task10().c--;
     e=a+ +b + +new Task10().c + d--;
     int f = -a + b-- + -new Task10().c -d++;
     int sum = a+b+new Task10().c+d+e+f;
        System.out.println("sum :"+ sum);
    }
}
