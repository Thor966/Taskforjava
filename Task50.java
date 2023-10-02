package Gawande;

import java.util.Arrays;

// Logical programming on array
/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.


middleWay([1, 2, 3], [4, 5, 6]) ? [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) ? [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) ? [2, 4]

public int[] middleWay(int[] a, int[] b)
{
    // write your logic here
}
 */
public class Task50
{

    int [] middleway(int a[],int b[])
    {
        int mid[] = new int[2];

        mid[0]=a[1];
        mid[1]=b[1];
        return mid;


    }
    public static void main(String[] args)
    {
        Task50 obj = new Task50();
        int arr1[] = {7,7,7};
        int arr2[] = {3,8,0};
        int result[] = obj.middleway(arr1,arr2);
        System.out.println(Arrays.toString(result));


    }
}
