package Gawande;

// Logical programming an array

import java.util.Arrays;

/*
Given an int array length 3, if there is 2 in the array immediately followed by a 3,
change the element 3 to 0, and return the changed array.
123---120
234---204
122---122

int[] meth1()
{
    //write your logic here
}
 */
import java.util.Scanner;
public class Task40
{

    Scanner sc = new Scanner(System.in);
    int[] meth1()
    {
        int arr[] ={2,3,4};

        for(int i=0;i<2;i++)
        {
            if(arr[i]==2 && arr[i+1]==3)
            {
                arr[i+1]=0;
            }
        }
        return arr;


    }
    public static void main(String[] args) {
        Task40 obj= new Task40();
        int[] result =obj.meth1();
        System.out.println(Arrays.toString(result));



    }
}
