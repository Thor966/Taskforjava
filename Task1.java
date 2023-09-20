package Gawande;

// Task for constructor
//Constructor by assining a value for a instance variable

public class Task1
{
    String statename;
    int noofdist;
    String code;


    static String country ="India";

    Task1(String name, int dist, String statecode)
    {
        statename = name;
        code = statecode;
        noofdist = dist;
    }

    public static void main (String [] args)
    {
       Task1 a1 = new Task1("maharastra",36,"MH");
       Task1 a2 = new Task1("gujrat",33,"GJ");
       Task1 a3 = new Task1("telangana",33,"TS");

        System.out.println("a1 :"+a1.statename+" "+a1.code+" "+a1.noofdist+" "+Task1.country);
        System.out.println("a2 :"+a2.statename+" "+a2.code+" "+a2.noofdist+" "+Task1.country);
        System.out.println("a3 :"+a3.statename+" "+a3.code+" "+a3.noofdist+" "+Task1.country);
    }

}
