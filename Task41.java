package Gawande;


// Logical programming in array
/*
Given an int array of length 2, return true if the array doesnot contain 2 or 3.
1,2---false
4,5---true
3,6---false

boolean meth2(int []arr)
{
   //write your logic here
}
 */
public class Task41
{

    boolean meth1(int arr[])
    {

        return !(arr[0]==2||arr[0]==3||arr[1]==2||arr[1]==3);
    }

    public static void main(String[] args)
    {
      Task41 obj = new Task41();
        int num [] ={1,2};

        boolean result = obj.meth1(num);
        System.out.println(result);
    }
}
