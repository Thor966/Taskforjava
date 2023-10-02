package Gawande;

// Logical programming on array
/*
Given an array of ints, return a new array length 2 containing
the first and last elements from the original array. The original array will be length 1 or more.


makeEnds([1, 2, 3]) ? [1, 3]
makeEnds([1, 2, 3, 4]) ? [1, 4]
makeEnds([7, 4, 6, 2]) ? [7, 2]


public int[] makeEnds(int[] nums)
{



    // write your logic here
}
 */
import java.util.Arrays;
public class Task51
{
    int [] makeend(int nums[])
    {
        int firstlast[]=new int[2];
        if(nums.length-1>=1)
        {
            firstlast[0]=nums[0];
            firstlast[1]=nums[nums.length-1];
        }
        return firstlast;
    }

    public static void main(String[] args)
    {
       Task51 obj = new Task51();
       int arr[] = {1,2,3,4};
       int []result= obj.makeend(arr);
        System.out.println(Arrays.toString(result));

    }

}
