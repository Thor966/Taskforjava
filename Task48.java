package Gawande;

import java.util.Arrays;

// logical programing on array
/*
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.


rotateLeft3([1, 2, 3]) ? [2, 3, 1]
rotateLeft3([5, 11, 9]) ? [11, 9, 5]
rotateLeft3([7, 0, 0]) ? [0, 0, 7]

public int[] rotateLeft3(int[] nums)
{
    // write your logic here
}
 */
public class Task48
{
    int [] rotate(int num[])
    {
        int arr2[]=new int[3];

        arr2[0]=num[1];
        arr2[1]=num[2];
        arr2[2]=num[0];

        return arr2;
    }
    public static void main(String[] args)
    {
        Task48 obj = new Task48();
        int arr[] = {45,3,2};
        int result[] = obj.rotate(arr);
        System.out.println(Arrays.toString(result));

    }

}
