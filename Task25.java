package Gawande;

// Task on selection statements
/*
Create a Java program that presents a simple menu to the user with several options.
The program should allow the user to select an option using a "switch-case" statement and perform
the corresponding action.
 */
public class Task25
{
void menu(int x)
{
    int option =x;
    switch(option)
    {
        case 1:
            System.out.println("You are selected the option 1");
            break;
        case 2:
            System.out.println("You are selected the option 2");
            break;
        case 3:
            System.out.println("You are selected the option 3");
            break;
        case 4:
            System.out.println("You are selected the option 4");
            break;
        default:
            System.out.println("Invalid Option");
            break;
    }
}

public static void main(String[] args)
{
       new Task25().menu(5);
}
}
