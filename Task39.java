package Gawande;
/*
public class Task39
{
char[] meth1(String [] x,int []y)
{
     // print element in 'x' with the help of for loop
     // print element in 'y' with the help of for each loop
}
main()
{
    /call meth1() and the print the values which were returned by meth1()
}
}

 */
public class Task39
{

    char[] meth1(String [] x,int []y)
    {
        System.out.println("print element in 'x' with the help of for loop");
        for(int i=0;i < x.length;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();


        System.out.println("print element in 'y' with the help of for each loop");
        for(int a:y)
        {
            System.out.print(a+" ");
        }
        System.out.println();


        char alphabets[] = {'A','B','C','D','E','F','E'};
        return alphabets;
    }

    public static void main(String[] args)
    {
        String x[]={"India","USA","Rasia"};
        int y[]={10,20,30,40,50};

       char c[] = new Task39().meth1(x,y);

        System.out.println("values return by meth1(): ");
        for(char m:c)
        {
            System.out.print(m+" ");
        }

    }

}
