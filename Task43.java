package Gawande;

// Logical programming on array
/*
Given an array of ints, return true if 6 appears as either the first or last element in the array.
The array will be length 1 or more.

firstLast6([1, 2, 6]) ? true
firstLast6([6, 1, 2, 3]) ? true
firstLast6([13, 6, 1, 2, 3]) ? false

public boolean firstLast6(int[] nums)
{
  //write your logic here
}
 */
public class Task43
{
    boolean meth1(int[] nums)
    {
        return (nums[0]==6||nums[nums.length-1]==6);

    }

    public static void main(String[] args)
    {
          Task43 obj=new Task43();
          int arr[]={6,2,9};
          boolean result = obj.meth1(arr);
        System.out.println(result);
    }

}
