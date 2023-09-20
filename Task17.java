package Gawande;

// Task on selection statements

/*
5) A school has the following rules for grading system:
a. Below 25 - F
b. 25 to Below 45 - E
c. 45 to Below 50 - D
d. 50 to Below 60 - C
e. 60 to Below 80 - B
f. Above 80 - A
Take a parameterized method which takes marks as input  and print the corresponding grade.
 */
public class Task17
{
void school(int marks)
{
    if(marks>100)
    {
        System.out.println(marks+" This is not valid marks");
        System.out.println("Please enter the marks below  100");
    }
    else if(marks>=80)
    {
        System.out.println(marks + " your grade is A");
    }
    else if(marks>=60&&marks<80)
    {
        System.out.println(marks+" your grade is B");
    }
    else if(marks>=50&&marks<60)
    {
        System.out.println(marks+ " your grade is C");
    }
    else if(marks>=45&&marks<50)
    {
        System.out.println(marks+" your grade is D");
    }
    else if(marks>=25&&marks<45)
    {
        System.out.println(marks+ " your grade is E");
    }
    else
    {
        System.out.println(marks+" your grade is F");
    }
}

public static void main(String[] args)
{
    new Task17().school(101);
}
}
