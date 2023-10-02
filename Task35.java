package Gawande;

/*
        *****
        *   *
        *   *
        *****
*/
public class Task35
{
    void meth1(int num)
    {
      for(int i=1;i<=4;i++)
      {
          for(int j=1;j<=5;j++)
          {
              if(i==1||j==1||i==4||j==5)
              {
                  System.out.print("*");
              }
              else
              {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
    }
    public static void main(String[] args)
    {
        new Task35().meth1(8);

    }
}
