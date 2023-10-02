package Gawande;

// Logical programming on array
/*

Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

makePi() ? [3, 1, 4]

public int[] makePi()
{
     // write your logic here
}
 */
import java.util.Arrays;
public class Task45
{

    public int[] makepi()
    {
        int arr[] = {3,1,4};

        return arr;
    }

    public static void main(String[] args)
    {

       Task45 obj = new Task45();
      int result[] = obj.makepi();
        System.out.println(Arrays.toString(result));
    }

}
