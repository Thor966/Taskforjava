package Gawande;

//Logical programming on array
/*
Given an int array, return a new array with double the length where its last element is the
same as the original array, and all the other elements are 0. The original array will be length 1 or more.


makeLast([4, 5, 6]) ? [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) ? [0, 0, 0, 2]
makeLast([3]) ? [0, 3]

public int[] makeLast(int[] nums)
{
    // write your logic here


}
 */
import java.util.Arrays;
public class Task52
{
    int[]  makelast(int nums[])
    {
        int max [] =new int [2*nums.length];
          max[max.length-1]=nums[nums.length-1];
        return max;

    }

    public static void main(String[] args)
    {
         Task52 obj = new Task52();
         int arr[] = {1,3,4};
         int[] result = obj.makelast(arr);
        System.out.println(Arrays.toString(result));

    }

}
