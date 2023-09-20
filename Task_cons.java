package Gawande;

// Task for constructor 01.09.23
public class Task_cons {
    public Task_cons()
    {
        System.out.println("sunday");
        Task_cons obj = new Task_cons(10);
        System.out.println("Tuesday");
        String s = obj.display("Challenge Accepted");
        System.out.println(s);

    }

    public Task_cons(int temp)
    {
        System.out.println("saturday");
        Task_cons obj = new Task_cons(10,20);
        int a= obj.meth1()+temp;
        System.out.println("====>"+ (a+obj.meth2()));
        System.out.println("monday");
    }

    String display(String s)
    {
        System.out.println("In the text statement are returning a string value");
        return s;
    }

    int meth1()
    {
        return 100;
    }

    int meth2()
    {
        return 99;
    }
    public Task_cons(int data , int temp)
    {
        System.out.println("thursday");
        System.out.println("====>" +(data+new Task_cons("Hi").meth2()-temp));
    }

    Task_cons(String s)
    {
        System.out.println(s);
    }

    public static void main (String [] args)
    {
     Task_cons obj = new Task_cons();
     System.out.println("Output verified");
    }
}
