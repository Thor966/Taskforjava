package Gawande;

// logical programming on array
/*
Given 2 arrays of ints, a and b, return true if they have the same first element
or they have the same last element. Both arrays will be length 1 or more.

commonEnd([1, 2, 3], [7, 3]) ? true
commonEnd([1, 2, 3], [7, 3, 2]) ? false
commonEnd([1, 2, 3], [1, 3]) ? true

public boolean commonEnd(int[] a, int[] b)
{

    // write your logic here
}
 */
public class Task46
{

    boolean commonEnd(int[] a, int[] b)
    {
        if(a.length>=1&&b.length>=1)
        {
            if(a[0]==b[0])
            {
                return true;
            }

            if(a.length-1==b.length)
            {
                return true;
            }
        }
        return false;


    }

    public static void main(String[] args)
    {
        Task46 obj = new Task46();
        int arr1[] = {1,2,3};
        int arr2[] = {1,5,8};
        boolean result = obj.commonEnd(arr1,arr2);
        System.out.println(result);

    }
}
