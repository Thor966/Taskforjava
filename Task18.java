package Gawande;

// Task on selection statements
/*
6) A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Take a parameterized method which takes users salary and year of service and print the bonus amount & Updated
 Salaray.
 */
public class Task18
{
    void meth1(int exp, int sal)
    {
        if(exp>=5)
        {
            int bonus = (sal*5)/100;
            System.out.println("your experiance is"+" "+exp+" "+"years so company decide give you to 5% bonus is: "+bonus+"\n");
            System.out.println("Your updated salary is:"+(sal+bonus));
        }
        else
        {
            System.out.println("Your experiance is less than 5 year so you cannot get a bonus");
        }
    }

    public static void main(String[] args)
    {
        new Task18().meth1(4,5000);
    }

}
