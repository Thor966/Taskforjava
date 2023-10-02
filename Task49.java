package Gawande;

// Logical programming on array
/*
Given an array of ints length 3, figure out which is larger,
the first or last element in the array, and set all the other elements to be that value. Return the changed array.


maxEnd3([1, 2, 3]) ? [3, 3, 3]
maxEnd3([11, 5, 9]) ? [11, 11, 11]
maxEnd3([2, 11, 20]) ? [20,20,20]

public int[] maxEnd3(int[] nums)

{
    // write your logic here
}
 */
import java.util.Arrays;
public class Task49
{
    int [] maxend(int[] nums)
    {
        int max[] = new int[3];
        if(nums[0]>nums[nums.length-1])
        {
            max[0]=nums[0];
            max[1]=nums[0];
            max[2]=nums[0];
        }
        else if (nums[nums.length-1]>nums[0])
        {
            max[0]=nums[nums.length-1];
            max[1]=nums[nums.length-1];
            max[2]=nums[nums.length-1];
        }
        return max;

    }
    public static void main(String[] args)
    {
        Task49 obj = new Task49();
        int arr[] ={98,2,3};
         int[]result = obj.maxend(arr);
        System.out.println(Arrays.toString(result));


    }
}
