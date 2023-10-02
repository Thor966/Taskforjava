package Gawande;

// Logical programming on array
/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

sameFirstLast([1, 2, 3]) ? false
sameFirstLast([1, 2, 3, 1]) ? true
sameFirstLast([1, 2, 1]) ? true

public boolean sameFirstLast(int[] nums)
{

    //write your logic here
}
 */
public class Task44
{

    boolean meth1(int[] nums)
    {

        return nums.length-1>=1 && nums[0]==nums[nums.length-1];

    }

    public static void main(String[] args)
    {
          Task44 obj = new Task44();
          int arr[]={1,2,1};
          boolean result = obj.meth1(arr);
          System.out.println(result);


    }

}
