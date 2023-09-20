package Gawande;

// Task on selection statements

/* 3) WAP Take values of length and breadth of a rectangle from parameterized method and check
  if it is square or not
 */
public class Task15
{
    void meth1(int length, int breath)
    {
        if(length==breath)
        {
            System.out.println("It is a square");
        }
        else
        {
            System.out.println("It is a rectangle");
        }
    }
    public static void main(String[] args)
    {
         Task15 obj = new Task15();
         //obj.meth1(20,20);
         obj.meth1(20,40);
    }

}
