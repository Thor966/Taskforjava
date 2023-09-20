package Gawande;

// Task5 on static keyword
public class Task6
{
    static  int x =10;//1st execute
    static int y = 20;//2 execute

    static //3rd execution
    {
        System.out.println("---Test11 SB1 called---");
        System.out.println("x :"+x);
        System.out.println("y :"+y);
    }

    static void m1() // 7th execution
    {
        int x =100;
        System.out.println("static method called");
        System.out.println("x :"+x);
        System.out.println("y :"+y);
    }

    public static void main(String[] args) // 5th execution
    {
     m1();
    }

    static //4th execution
    {
        System.out.println("--- Test11 SB2 called---");
        System.out.println("x :"+ x);
        System.out.println("y :"+y);
    }
}
