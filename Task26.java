package Gawande;

// Task on for loop
/*
for loop
    for loop
        while
            do-while
                switch
                    if-else
                        if-else-if
 */
public class Task26
{
    void meth1(int a,String country,String country_code,int space_mission) {
        String country_code1 = country_code;

        for (int i = 1; i <= 5; i++)//1<5
        {
            for (int j = 1; j <= 5; j++) {
                System.out.println("Aniket"+i);
                while(a>5)//7>5
                {
                    do
                    {
                        System.out.println("do block executed");
                        switch(country)
                        {
                            case "Rasia":
                                System.out.println("Your selected country is: "+country);
                                break;
                            case "India":
                               System.out.println("Your selected country is: "+country);
                                if(country_code==country_code1)
                                {
                                    System.out.println("Welcome to ISRO's Space programs!!"+"\n");
                                    System.out.println("ISRO's popular space mission are: "+"\n");
                                    if(space_mission==1)
                                    {
                                        System.out.println("1.  chandrayaan-1: ");
                                       System.out.println("India's first lunar mission, launched in 2008, which discovered water molecules on the Moon's surface."+"\n");
                                        System.out.println("Thank you!"+"\n");
                                    }
                                    else if(space_mission==2)
                                    {
                                        System.out.println("2.  Mangalyaan mission:");
                                        System.out.println("India's first interplanetary mission, launched in 2013, which successfully reached Mars orbit and conducted scientific observations of the planet."+"\n");
                                        System.out.println("Thank you!"+"\n");
                                    }
                                    else if(space_mission==3)
                                    {
                                        System.out.println("3. chandrayan-2");
                                        System.out.println("India's second lunar mission, launched in 2019, which included an orbiter, a lander (Vikram), and a rover (Pragyan). The lander, unfortunately, had a hard landing."+"\n");
                                        System.out.println("Thank you!"+"\n");
                                    }
                                    else if(space_mission==4)
                                    {
                                        System.out.println("4.  Chandrayaan-3 Mission:"+"\n");
                                        System.out.println("Chandrayaan-3 was intended to be the third mission in India's Chandrayaan lunar"+"\n"+ "exploration program, following Chandrayaan-1 and Chandrayaan-2."+"\n");
                                        System.out.println("Thank you!"+"\n");
                                    }

                                }
                                break;
                            case "America":
                                System.out.println("Your selected country is: "+country);
                                break;
                            case "France":
                                System.out.println("Your selected country is: "+country);
                                break;
                            default:
                                System.out.println(country+"  Inalid country name");

                       }
                    } while(a<=5);
                    a--;

                }
            }

        }
    }


    public static void main(String[] args)
    {
         new Task26().meth1(6,"India","In",4);
    }
}
