package Gawande;

// Task on selection statements
/*
7) Write a program to check whether an entered character is lowercase (a to z ) or uppercase ( A to Z ).
Take a parameterized method which takes a single "character" as an input.
 */
public class Task19
{
void meth1(char c)
{
    int i = c;
    if(i>=97)
    {
        System.out.println(c +" is a lowercase alphabet");
    }
    else
    {
        System.out.println(c+" is a uppercase alphabet");
    }
}

    public static void main(String[] args)
    {
        new Task19().meth1('D');
    }


}
