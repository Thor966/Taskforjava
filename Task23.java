package Gawande;

// Task on selecction statements

/*
Create a simple Java program that acts as a basic calculator.
Prompt the user to enter two numbers.

Prompt the user to enter an operation choice:

1 for addition
2 for subtraction
3 for multiplication
4 for division
 */
public class Task23
{
      void calculator(int a, int b,int c)
      {
            int choice = c;
            int result;

            if(choice==1)
            {
                result = a+b;
                System.out.println("Addition:- "+result);
            }
            else if(choice==2)
            {
                result = a-b;
                System.out.println("Subtraction:- "+result);
            }
            else if(choice==3)
            {
                result = a*b;
                System.out.println("Multiplication:- "+ result);
            }
            else if(choice==4)
            {
                result = a/b;
                System.out.println("Division:- "+result);
            }
            else
            {
                System.out.println("Enter valid choice!!!");
            }
      }

    public static void main(String[] args)
    {
               Task23 obj = new Task23();

        System.out.println("Enter two number:-"+"\n"+"Enter your choice:-"+"\n"+"1.Addition  2.Subtraction"+"\n"+"3.multiplication  4.Division"+"\n");
        obj.calculator(23,7,4);
    }
}
