package Gawande;

// Logical programming on array

/*
Given an array of ints length 3, return the sum of all the elements.


sum3([1, 2, 3]) ? 6
sum3([5, 11, 2]) ? 18
sum3([7, 0, 0]) ? 7

public int sum3(int[] nums)
{
    // write your logic here

}
 */
public class Task47
{
    int sum(int[] nums)
    {
        return nums[0]+nums[1]+nums[2];

    }
    public static void main(String[] args)
    {
       Task47 obj = new Task47();
       int arr[] = {5,11,2};
       int sum = obj.sum(arr);
        System.out.println(sum);

    }

}
