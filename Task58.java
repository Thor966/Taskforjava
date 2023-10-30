package Gawande;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task58
{
    void meth1()
    {
        Scanner sc = new Scanner(System.in);

        int num1 =0;
        int num2 =0;
        boolean validinput=false;
        while (!validinput)
        {
            try
            {
                System.out.println("Enter the first integer number:  ");
                num1 = sc.nextInt();

                System.out.println("Enter the second integer number:  ");
                num2 = sc.nextInt();
                if(num2==0)
                {
                    // throw new ArithmeticException("Division by zero is not allowed.");
                    System.out.println("Division of zero is not possible");
                }
                else
                {
                    validinput=true;
                }


            }
            catch(ArithmeticException e)
            {
                // e.printStackTrace();
                System.out.println("Can't divide by zero");
                // a.printStackTrace();
                System.out.println("Please enter valid numbers ");


            }
            catch(InputMismatchException a)
            {
                System.out.println("Please enter the valid integer number ");
                sc.nextLine();

            }


        }
        int division = num1/num2;
        System.out.println(division);
        sc.close();

    }

    public static void main(String[] args)
    {
        new Task58().meth1();

    }

}
