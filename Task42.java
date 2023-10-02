package Gawande;

// Logical programming in array
/*
Given an array of integer, return the sum of the first 2 elements in the array.
 If the array length is less than 2, just sum up the elements that exist, return 0 if the array length is 0.
1,2,3---3
5,5---10
8,2,1,4---10

int meth3(int []arr)
{
   //write your logic here
}
 */
public class Task42
{
    int meth1(int [] arr)
    {
       if(arr.length>=2)
           return arr[0]+arr[1];
       else if(arr.length==1)
          return arr[0];
       else
           return 0;
    }

    public static void main(String[] args)
    {
       Task42 obj = new Task42();
        int num [] = {4,5,3,7,4};
         int result = obj.meth1(num);
        System.out.println(result);

    }

}
