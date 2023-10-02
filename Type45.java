package Gawande;

import java.util.Arrays;
import java.util.Scanner;
public class Type45
{
    Scanner sc = new Scanner(System.in);
    void ticketbooking()
    {
        System.out.println("---------Welcome----------");
        System.out.println("1) Thor");
        System.out.println("2) Infinity_war");
        System.out.println("3)  Endgame");
        System.out.println("Enter your movie name");

        String movie = sc.nextLine();
        System.out.println("Your selected movie is: "+movie);
        System.out.println("How many tickets you need!");

        int ticket =sc.nextInt();
        String names[] = new String[ticket];
        System.out.println("Please enter "+names.length+" names to book your ticket");

        for(int i=0;i<= names.length-1;i++)
        {
            names[i]=sc.nextLine();
        }

        System.out.println(names.length+" tickets were booked for "+ movie);
        System.out.println("Person name: "+ Arrays.toString(names));

        System.out.println("Enter  your row number: ");
        int rownumber= sc.nextInt();
        int seatno[] =new int [ticket];

        System.out.println("Your seat number is: ");
        for(int j=0;j<= names.length-1;j++)
        {
                seatno[j]= j+1;
            System.out.println(names[j]+": "+seatno[j]);
        }

        System.out.println("Please go to the row number:  "+rownumber);


    }

    public static void main(String[] args)
    {

        new Type45().ticketbooking();
    }
}
