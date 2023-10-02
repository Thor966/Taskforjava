package Gawande;
import java.util.Scanner;
public class Task36
{
     static Scanner sc = new Scanner(System.in);
    int meth1(int a, String data)
    {
        System.out.println("a value "+a);
        System.out.println("data value "+data);
        return 198;
    }

    String meth2(int x, int y)
    {
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        return "S";
    }

    int meth3(int i)
    {
        System.out.println("i value: "+i);
        return 4;
    }

    public static void main(String[] args)
    {
       Task36 obj = new Task36();

        System.out.println("Enter a and data value");
        int t = obj.meth1(sc.nextInt(),sc.nextLine());
        System.out.println("Enter the x and y value");
       obj.meth2(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the i value");
       obj.meth3(sc.nextInt());

        System.out.println("Value return by method1() is : "+t);
    }
}
