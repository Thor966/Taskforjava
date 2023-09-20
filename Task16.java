package Gawande;

// Task on selection statements

/*
3)A shop will give discount of 10% if the cost of purchased quantity is equal to (or) more than 1000.
Take a Parameterized method which gives the quantity(units) Suppose, one unit will cost 100.
Judge and print total cost for user
 */
public class Task16
{
    void meth1(int units)
    {
        int cost =100*units;
        int discount = (cost*10)/100;
        if(cost>=1000)
        {
            System.out.println("congratulation !!! you get a 10% discount");
            System.out.println("you have pay to: "+" "+ (cost-discount)+"/-");
            System.out.println("Thank you for visiting our shop!!");
        }
        else
        {
            System.out.println("your bill is: "+ cost+"/-");
            System.out.println("shop more"+" "+(1000-cost)+" "+"to get a 10% discount");
        }
    }

    public static void main(String[] args)
    {

        new Task16().meth1(10);
    }
}
