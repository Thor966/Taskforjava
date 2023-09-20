package Gawande;
// Task on type casting
/*
Write a Java program that performs the following type casting operations:

Declare a variable of type double and initialize it with a value.
Declare another variable of type int.
Use explicit type casting to convert the double variable to an int and assign the result to the int variable. Be sure to handle any potential loss of data.
Print the original double value and the resulting int value.
 */
public class Task12
{
void explicit()
{
    double d =12.34;
    int i = (int)d;

    System.out.println("value of double is :"+ d);
    System.out.println("value of int is:"+ i);
}

public static void main(String[] args)
{
    new Task12().explicit();
}
}
